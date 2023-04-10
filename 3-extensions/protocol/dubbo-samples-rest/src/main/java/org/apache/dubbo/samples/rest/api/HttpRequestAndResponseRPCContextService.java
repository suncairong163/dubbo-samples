/*
 *
 *   Licensed to the Apache Software Foundation (ASF) under one or more
 *   contributor license agreements.  See the NOTICE file distributed with
 *   this work for additional information regarding copyright ownership.
 *   The ASF licenses this file to You under the Apache License, Version 2.0
 *   (the "License"); you may not use this file except in compliance with
 *   the License.  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.apache.dubbo.samples.rest.api;


import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import java.util.List;

@Path("/demoService")
public interface HttpRequestAndResponseRPCContextService {

    @POST
    @Path("/httpRequestParam")
    @Consumes({javax.ws.rs.core.MediaType.TEXT_PLAIN})
    String httpRequestParam(@QueryParam("name") String hello);

    @POST
    @Path("/httpRequestHeader")
    @Consumes({javax.ws.rs.core.MediaType.TEXT_PLAIN})
    String httpRequestHeader(@HeaderParam("header") String hello);

    @POST
    @Path("/httpResponseHeader")
    @Consumes({javax.ws.rs.core.MediaType.TEXT_PLAIN})
    List<String> httpResponseHeader(@HeaderParam("response") String hello);


}

