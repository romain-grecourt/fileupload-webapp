node {
   stage('process-trigger') {
     def causes = currentBuild.rawBuild.getCauses()
     if(causes.size() > 0
        && causes[0].getClass().getName() == "org.jenkinsci.plugins.ghprb.GhprbCause"){
        def commentBody = currentBuild.rawBuild.getCauses()[0].getCommentBody()

        // this is illustrative.
        // the ghprb plugin can be configured with a loose regexp
        // trigger different job based on the comment content
        if(commentBody.contains("tests")){
            //println "triggering fileupload-webapp/PR-${ghprbPullId}"
            build job: "fileupload-webapp/PR-${ghprbPullId}"
        } else {
            // fail here if the comment content is supported
            error("Unsupported comment message")
        }
     } else {
        // only process comment based trigger
        error("Unsupported trigger")
     }
   }
}
