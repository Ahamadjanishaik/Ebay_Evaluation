
@Advanced_Search
Feature: Validate Advanced Search feature of Ebay webpage 
  

  @tag1
  Scenario: Validate Advanced Search
    Given Open Browser and enter url 
    And click on Advanced    
    And user enter keywords keywords_opts exclude category_dropdown
    And user selects radio buttons classifies_ads condition show results     
    And user selects sellers section
    Then Validate search result

  #@tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
