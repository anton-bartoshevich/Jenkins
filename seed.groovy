folder('SeedJobsFolder') {
    displayName('SeedJobsFolder')
    description('SeedJobsFolder')
}

job("SeedJobsFolder/get__seed_job"){
    scm {
        github('anton-bartoshevich/Jenkins', 'main')
    }
    steps {
        shell("""
            ls -l /var/lib/jenkins/jobs/SeedJobsFolder/jobs/
            rm -rf /var/lib/jenkins/jobs/SeedJobsFolder/jobs/0*
            pwd
            ls -l
            mv /var/lib/jenkins/workspace/SeedJobsFolder/get__seed_job/jobs/* /var/lib/jenkins/jobs/SeedJobsFolder/jobs/
            ls -l /var/lib/jenkins/jobs/SeedJobsFolder/jobs/
        """)
    }
}
