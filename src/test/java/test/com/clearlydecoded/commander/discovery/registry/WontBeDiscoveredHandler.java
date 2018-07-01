/*
 * Copyright 2018 Yaakov Chaikin (yaakov@ClearlyDecoded.com). Licensed under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except in compliance with the License. You
 * may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 * by applicable law or agreed to in writing, software distributed under the License is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 * the License for the specific language governing permissions and limitations under the License.
 */
package test.com.clearlydecoded.commander.discovery.registry;

import com.clearlydecoded.commander.CommandHandler;

/**
 * Won't be automatically discovered because it's not marked with @Service.
 */
public class WontBeDiscoveredHandler implements CommandHandler<Command2, Command2Response> {


  @Override
  public Command2Response execute(Command2 command) {
    return null;
  }

  @Override
  public String getCompatibleCommandType() {
    return null;
  }

  @Override
  public Class<Command2> getCompatibleCommandClassType() {
    return null;
  }

  @Override
  public Class<Command2Response> getCompatibleCommandResponseClassType() {
    return null;
  }
}
