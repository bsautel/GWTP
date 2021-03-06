/**
 * Copyright 2011 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.gwtplatform.dispatch.server.actionhandlervalidator;

import com.gwtplatform.dispatch.server.actionhandler.ActionHandler;
import com.gwtplatform.dispatch.server.actionvalidator.ActionValidator;
import com.gwtplatform.dispatch.shared.Action;
import com.gwtplatform.dispatch.shared.Result;

/**
 * Convenience class to store {@link com.gwtplatform.dispatch.server.actionhandler.ActionHandler} and
 * {@link com.gwtplatform.dispatch.server.actionvalidator.ActionValidator}
 * class definitions.
 *
 * @param <A> Type of associated {@link com.gwtplatform.dispatch.shared.Action}
 * @param <R> Type of associated {@link com.gwtplatform.dispatch.shared.Result}
 * @author Christian Goudreau
 *
 * @deprecated Please use
 * {@link com.gwtplatform.dispatch.rpc.server.actionhandlervalidator.ActionHandlerValidatorClass}.
 */
@Deprecated
public class ActionHandlerValidatorClass<A extends Action<R>, R extends Result> {
    private final Class<? extends ActionHandler<A, R>> actionHandlerClass;
    private final Class<? extends ActionValidator> actionValidatorClass;

    public ActionHandlerValidatorClass(
            final Class<? extends ActionHandler<A, R>> handlerClass,
            final Class<? extends ActionValidator> actionValidatorClass) {
        this.actionHandlerClass = handlerClass;
        this.actionValidatorClass = actionValidatorClass;
    }

    public Class<? extends ActionHandler<A, R>> getActionHandlerClass() {
        return actionHandlerClass;
    }

    public Class<? extends ActionValidator> getActionValidatorClass() {
        return actionValidatorClass;
    }
}
