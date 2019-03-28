/**
 * OLAT - Online Learning and Training<br>
 * https://www.olat.org
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); <br>
 * you may not use this file except in compliance with the License.<br>
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,<br>
 * software distributed under the License is distributed on an "AS IS" BASIS, <br>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. <br>
 * See the License for the specific language governing permissions and <br>
 * limitations under the License.
 * <p>
 * Copyright (c) since 2004 at Multimedia- & E-Learning Services (MELS),<br>
 * University of Zurich, Switzerland.
 * <p>
 */

package ch.uzh.extension.{{ cookiecutter.appname }};

import ch.uzh.extension.{{ cookiecutter.appname }}.nodes.{{ cookiecutter.appnameUpper }}CourseNode;
import ch.uzh.extension.{{ cookiecutter.appname }}.nodes.{{ cookiecutter.appnameUpper }}CourseNodeConfiguration;
import org.olat.course.editor.CourseEditorEnv;
import org.olat.course.editor.StatusDescription;
import org.olat.core.CoreSpringFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

/**
 */
@SuppressWarnings("initialization.fields.uninitialized")
public class IT{{ cookiecutter.appnameUpper }}CourseNodeTest extends {{ cookiecutter.appnameUpper }}TestCase {

	private {{ cookiecutter.appnameUpper }}CourseNode courseNode;

	@Before
	public void getCourseNode() {
		{{ cookiecutter.appnameUpper }}CourseNodeConfiguration courseNodeConfig = ({{ cookiecutter.appnameUpper }}CourseNodeConfiguration) CoreSpringFactory.getBean(
		"{{ cookiecutter.appname }}CourseNodeConfiguration");
		courseNode = ({{ cookiecutter.appnameUpper }}CourseNode) courseNodeConfig.getInstance();
	}

	@Test
	public void createEditController() {
	}

	@Test
	public void isConfigValid() {
		assertEquals(StatusDescription.NOERROR, courseNode.isConfigValid());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void getReferencedRepositoryEntry() {
		courseNode.getReferencedRepositoryEntry();
	}

	@Test
	public void needsReferenceToARepositoryEntry() {
		assertFalse(courseNode.needsReferenceToARepositoryEntry());
	}

	@Test
	public void createNodeRunConstructionResult() {
	}

	@Test
	public void isConfigValidEnv() {
		CourseEditorEnv env = mock(CourseEditorEnv.class);
		assertEquals(0, courseNode.isConfigValid(env).length);
	}

}
