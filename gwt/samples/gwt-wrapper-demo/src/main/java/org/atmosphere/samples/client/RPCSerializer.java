/*
 * Copyright 2013 Jeanfrancois Arcand
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
package org.atmosphere.samples.client;

import com.google.gwt.user.client.rpc.SerializationException;
import org.atmosphere.extensions.gwtwrapper.client.GwtClientSerializer;
import org.atmosphere.extensions.gwtwrapper.client.GwtSerialTypes;

/**
 *
 * @author jotec
 */
@GwtSerialTypes(RPCEvent.class)
abstract public class RPCSerializer extends GwtClientSerializer {

    @Override
    public Object deserialize(String message) throws SerializationException {
        return deserializeRPC(message);
    }

    @Override
    public String serialize(Object message) throws SerializationException {
        return serializeRPC(message);
    }
    
}