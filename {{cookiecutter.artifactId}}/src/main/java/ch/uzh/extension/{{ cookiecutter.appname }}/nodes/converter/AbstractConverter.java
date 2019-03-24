package ch.uzh.extension.{{ cookiecutter.appname }}.nodes.converter;

import ch.uzh.extension.tool.NullUtil;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Iterator;

public abstract class AbstractConverter<T> implements Converter {

	protected static final String VERSION_NAME = "version";

	protected abstract Class<T> getType();

	protected abstract void write(T t, HierarchicalStreamWriter writer, MarshallingContext context);

	protected abstract T read(int version, HierarchicalStreamReader reader, UnmarshallingContext context);

	@Override
	public void marshal(Object source, HierarchicalStreamWriter writer, MarshallingContext context) {
		T t = (T) source;
		write(t, writer, context);
	}

	@Override
	public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
		int version = (int) context.get(VERSION_NAME);
		T t = read(version, reader, context);
		return NullUtil.notNullOrFail(t);
	}

	@Override
	public boolean canConvert(Class type) {
		return type.equals(getType());
	}

	protected String getAttributeValue(String name, String defaultValue, HierarchicalStreamReader reader,
									   UnmarshallingContext context) {
		String attributeValue = getAttributeValue(name, reader, context);
		if (attributeValue == null || "".equalsIgnoreCase(attributeValue)) {
			return defaultValue;
		} else {
			return attributeValue;
		}
	}

	@Nullable
	protected String getAttributeValue(String name, HierarchicalStreamReader reader, UnmarshallingContext context) {
		Iterator<String> it = reader.getAttributeNames();
		while (it.hasNext()) {
			String next = it.next();
			if (next.equals(name)) {
				return reader.getAttribute(name);
			}
		}
		return null;
	}

	@Nullable
	protected String getNodeValue(String name, HierarchicalStreamReader reader, UnmarshallingContext context) {
		if (reader.getNodeName().equals(name)) {
			return reader.getValue();
		}
		return null;
	}

}
