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
import ch.uzh.extension.olatreplacement.translator.LmsuzhTranslator;
import org.olat.core.gui.UserRequest;
import org.olat.core.gui.components.stack.BreadcrumbPanel;
import org.olat.core.gui.control.WindowControl;
import org.olat.core.gui.util.WindowControlMocker;
import org.olat.course.ICourse;
import org.olat.course.editor.CourseEditorEnv;
import org.olat.course.editor.StatusDescription;
import org.olat.core.CoreSpringFactory;
import org.junit.Before;
import org.junit.Test;
import org.olat.course.run.userview.NodeEvaluation;
import org.olat.course.run.userview.UserCourseEnvironment;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 */
@SuppressWarnings("initialization.fields.uninitialized")
public class IT{{ cookiecutter.appnameUpper }}CourseNodeTest extends {{ cookiecutter.appnameUpper }}TestCase {

	private {{ cookiecutter.appnameUpper }}CourseNode courseNode;

	@Before
	public void getCourseNode() {
		LmsuzhTranslator translator = new NoopLmsuzhTranslator();
		{{ cookiecutter.appnameUpper }}BeanFactory beanFactory = new {{ cookiecutter.appnameUpper }}BeanFactory(translator);
		courseNode = new {{ cookiecutter.appnameUpper }}CourseNode(beanFactory);
	}

	@Test
	public void createEditController() {
		UserRequest userRequest = mock(UserRequest.class);
		WindowControl windowControl = new WindowControlMocker();
		BreadcrumbPanel stackPanel = mock(BreadcrumbPanel.class);
		ICourse course = mock(ICourse.class);
		UserCourseEnvironment userCourseEnvironment = mock(UserCourseEnvironment.class);
		// courseNode.createEditController(userRequest, windowControl, stackPanel, course, userCourseEnvironment);
		// TODO: add a sensible assertion
		assertTrue(true);
	}

	@Test
	public void isConfigValid() {
		assertEquals(StatusDescription.NOERROR, courseNode.isConfigValid());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void getReferencedRepositoryEntry() { courseNode.getReferencedRepositoryEntry(); }

	@Test
	public void needsReferenceToARepositoryEntry() {
		assertFalse(courseNode.needsReferenceToARepositoryEntry());
	}

	@Test
	public void createNodeRunConstructionResult() {
		UserRequest userRequest = mock(UserRequest.class);
		WindowControl windowControl = new WindowControlMocker();
		UserCourseEnvironment userCourseEnvironment = mock(UserCourseEnvironment.class);
		NodeEvaluation nodeEvaluation = mock(NodeEvaluation.class);
		courseNode.createNodeRunConstructionResult(
			userRequest, windowControl, userCourseEnvironment, nodeEvaluation, "");
		// TODO: add a sensible assertion
		assertTrue(true);
	}

	@Test
	public void isConfigValidEnv() {
		CourseEditorEnv env = mock(CourseEditorEnv.class);
		assertEquals(0, courseNode.isConfigValid(env).length);
	}

}
