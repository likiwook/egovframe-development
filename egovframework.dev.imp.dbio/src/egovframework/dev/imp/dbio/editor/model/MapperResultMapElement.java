/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.dev.imp.dbio.editor.model;

import org.w3c.dom.Element;

/**
 * MapperResultMapElement 모델
 * @author 개발환경 개발팀 김형조
 * @since 2009.02.20
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *   
 *   수정일      수정자           수정내용
 *  -------    --------    ---------------------------
 *   2019.02.25  김효수          MyBatis DBIO  
 *
 * 
 * </pre>
 */
public class MapperResultMapElement extends MapperElement {

	/**
	 * 생성자
	 * 
	 * @param element
	 * @param parent
	 */
	public MapperResultMapElement(Element element, Object parent) {
		super(element, parent);
	}
	
	/**
	 * 클래스명 반환
	 * 
	 * @return 클래스명
	 */
	public String getClassName() {
		return element.getAttribute("type"); //$NON-NLS-1$
	}
	
	/**
	 * 클래스명 설정
	 * 
	 * @param value
	 */
	public void setClassName(String value) {
		element.setAttribute("type", value); //$NON-NLS-1$
	}
}
