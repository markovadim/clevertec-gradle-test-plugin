Plugin of check test report.  
Public to local repository:  

    ./gradlew clean build
    ./gradlew publishToMavenLocal  

Apply plugin:  

    plugins {
      id 'gradle-test-plugin' version '0.1'
    }
