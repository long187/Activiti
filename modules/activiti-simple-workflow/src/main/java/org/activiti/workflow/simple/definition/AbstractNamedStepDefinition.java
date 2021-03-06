/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.activiti.workflow.simple.definition;

/**
 * Superclass for all {@link StepDefinition} classes that have a name or description.
 * 
 * @author Joram Barrez
 */
public abstract class AbstractNamedStepDefinition implements StepDefinition {

  private static final long serialVersionUID = 1L;
  
  protected String id;
	protected String name;
  protected String description;
  protected boolean startsWithPrevious;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isStartsWithPrevious() {
    return startsWithPrevious;
  }

  public void setStartsWithPrevious(boolean startsWithPrevious) {
    this.startsWithPrevious = startsWithPrevious;
  }
}
