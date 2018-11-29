node {
    stage('process-trigger') {
        def commentBody = get_comment_trigger();
        if(commentBody != null){
            // this is illustrative.
            // the ghprb plugin can be configured with a loose regexp
            // trigger different job based on the comment content
            if(commentBody.contains("tests")){
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

@NonCPS
def get_comment_trigger() {
    def causes = currentBuild.rawBuild.getCauses()
    if(causes.size() > 0
        && causes[0].getClass().getName() == "org.jenkinsci.plugins.ghprb.GhprbCause"){
        return currentBuild.rawBuild.getCauses()[0].getCommentBody()
    }
    return null;
}