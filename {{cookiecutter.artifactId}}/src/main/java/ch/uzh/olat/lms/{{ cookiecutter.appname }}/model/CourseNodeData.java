package ch.uzh.olat.lms.{{ cookiecutter.appname }}.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

public class CourseNodeData implements Serializable {

  @Getter
  @Setter
  @XStreamAlias("resourceId")
  private long resourceableId;

}
