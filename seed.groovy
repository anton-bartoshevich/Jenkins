job("Folder"){
   scm {
        github('anton-bartoshevich/Jenkins', 'main')
    }
            steps {
              shell('''
	    ls -l /var/lib/jenkins/jobs/
            rm -rf /var/lib/jenkins/jobs/0*
            pwd
            ls -l
            mv /var/lib/jenkins/workspace/Folder/jobs/* '/var/lib/jenkins/jobs/'
            ls -l /var/lib/jenkins/jobs/
''')
     
        }

    }
