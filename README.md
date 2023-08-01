

# tests run command
    mvn clean test -Dcucumber.filter.tags=@regressiontest
# tests dry run command 
    mvn clean test -Dcucumber.execution.dry-run=false