node {
    // 1 minute to check out project
    timeout(time: 1) {
        stage 'Checkout'
        checkout scm
    }

    // Run the maven build with 2 minute timeout
    timeout(time: 2) {
        stage 'Build'
        sh "./loremipsum.groovy"
    }
}
