/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package org.raml.jaxrs.examples.resources;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.xml.ws.Response;

@Path("/left/right/left")
public class ResourceWithQueryParameters {

  @Path("step")
  @POST
  public Response postWithQueryParameters(
                                          @DefaultValue("military") @QueryParam("typeOfStep") String typeOfStep,
                                          @DefaultValue("jack") @QueryParam("captainName") String theName,
                                          @QueryParam("ageOfCaptain") int captainAge, String foo) {
    return null;
  }
}
