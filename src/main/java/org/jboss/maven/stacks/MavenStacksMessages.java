/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.jboss.maven.stacks;

import org.apache.maven.plugin.logging.Log;
import org.jboss.jdf.stacks.client.messages.StacksMessages;

/**
 * @author <a href="mailto:benevides@redhat.com">Rafael Benevides</a>
 *
 */
public class MavenStacksMessages implements StacksMessages {

    private Log log;

    /**
     * @param log
     */
    public MavenStacksMessages(Log log) {
        this.log = log;
    }

    /* (non-Javadoc)
     * @see org.jboss.jdf.stacks.client.messages.StacksMessages#showInfoMessage(java.lang.String)
     */
    public void showInfoMessage(String infoMessage) {
        log.info(infoMessage);
    }

    /* (non-Javadoc)
     * @see org.jboss.jdf.stacks.client.messages.StacksMessages#showWarnMessage(java.lang.String)
     */
    public void showWarnMessage(String warnMessage) {
        log.info(warnMessage);
    }

    /* (non-Javadoc)
     * @see org.jboss.jdf.stacks.client.messages.StacksMessages#showDebugMessage(java.lang.String)
     */
    public void showDebugMessage(String debugMessage) {
        log.debug(debugMessage);
    }

    /* (non-Javadoc)
     * @see org.jboss.jdf.stacks.client.messages.StacksMessages#showErrorMessage(java.lang.String)
     */
    public void showErrorMessage(String errorMessage) {
        log.error(errorMessage);
    }

    /* (non-Javadoc)
     * @see org.jboss.jdf.stacks.client.messages.StacksMessages#showErrorMessageWithCause(java.lang.String, java.lang.Throwable)
     */
    public void showErrorMessageWithCause(String errorMessage, Throwable cause) {
        log.error(errorMessage, cause);
    }

}
