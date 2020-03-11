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
package egovframework.dev.imp.dbio.wizard;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import egovframework.dev.imp.dbio.DBIOPlugin;
import egovframework.dev.imp.dbio.common.DbioMessages;

/**
 * NewSqlMap WizardPage
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
 *   2009.02.20    김형조      최초 생성
 *
 * 
 * </pre>
 */
public class NewSqlMapWizardPage extends WizardNewFileCreationPage {

	/**
	 * 생성자
	 * 
	 * @param selection
	 */
	public NewSqlMapWizardPage(IStructuredSelection selection) {
		super(NewSqlMapWizardPage.class.getName(), selection);
		setAllowExistingResources(false);
		setFileExtension("xml"); //$NON-NLS-1$
		
		setImageDescriptor(DBIOPlugin.getDefault().getImageDescriptor(DBIOPlugin.IMG_SQL_MAP_WIZ_BANNER));
		
		setTitle(DbioMessages.NewSqlMapWizardPage_1);
		setDescription(DbioMessages.NewSqlMapWizardPage_2);
		
	}

	@Override
	protected InputStream getInitialContents() {
		String data = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" + //$NON-NLS-1$
			"<!DOCTYPE sqlMap PUBLIC \"-//ibatis.apache.org//DTD SQL Map 2.0//EN\" " + //$NON-NLS-1$
			"\"http://ibatis.apache.org/dtd/sql-map-2.dtd\" >\n" + //$NON-NLS-1$
			"<sqlMap />"; //$NON-NLS-1$
		return new ByteArrayInputStream(data.getBytes());
	}
}
