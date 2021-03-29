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
package egovframework.dev.imp.dbio.components.fields;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.events.HyperlinkAdapter;
import org.eclipse.ui.forms.events.HyperlinkEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Hyperlink;

/**
 * HyperLinkComboEditButtonField
 * @author 개발환경 개발팀 김효수
 * @since 2019.02.25
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
 * </pre>
 */
public class HyperLinkComboEditButtonField extends ComboEditButtonField {

	/**
	 * 생성자
	 * 
	 * @param labelText
	 * @param buttonText
	 */
	public HyperLinkComboEditButtonField(String labelText, String buttonText) {
		super(labelText, buttonText);
	}

	/**
	 * 레이블 생성
	 * 
	 */
	@Override
	protected Label createLabel(FormToolkit toolkit, Composite parent, String text) {
		Hyperlink link = toolkit.createHyperlink(parent, text, SWT.NONE);
		link.addHyperlinkListener(new HyperlinkAdapter() {
				@Override
				public void linkActivated(HyperlinkEvent e) {
					fireFieldEvent(new FieldEvent(FieldEvent.Type.HyperLinkActivated, HyperLinkComboEditButtonField.this));
				}
		});
		return null;
	}
}
