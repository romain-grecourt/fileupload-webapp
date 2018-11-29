node {
   stage('process-trigger') {
     def causes = currentBuild.rawBuild.getCauses()
     if(causes.size() > 0
        && causes[0].getClass().getName() == "org.jenkinsci.plugins.ghprb.GhprbCause"){
        def commentBody = currentBuild.rawBuild.getCauses()[0].getCommentBody()
        println "triggered by comment: " + commentBody
     } else {
        println "not triggered by comment"
     }
   }
}
