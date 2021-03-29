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
package egovframework.mdev.imp.ide.wizards.operation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Moblie eGovFramework 프로젝트 서비스 인터페이스
 * @author 이종대
 * @since 2011.07.13
 * @version 1.0
 * @see <pre>
 * &lt;&lt; 개정이력(Modification Information) &gt;&gt;
 *   
 *	수정일      	수정자           수정내용
 *  -------			--------    ---------------------------
 *	2011.07.13  	이종대          최초 생성
 *
 * 
 * </pre>
 */
public interface EgovMobileProject {
    /**
     * 실행
     * @param monitor
     * @throws InvocationTargetException
     * @throws InterruptedException
     */
    public void run(IProgressMonitor monitor) throws InvocationTargetException,
            InterruptedException;
}
