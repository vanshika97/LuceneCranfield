LuceneCranfield a Java based project in Apache Lucene
======================================================
 Part of CS7IS3 module in Trinity College Dublin 

## Instructions to enter AWS Console ##
My login credentials:  
* Username: ___vanshika___  
* Password: ___vanshika___  
* IP address: 3.82.209.50  

1.  Open command prompt in _Adminstrator mode_ 
2.  Type the following commands to enter my AWS console
 
```
$ ssh vanshika@ec2-3-82-209-50.compute-1.amazonaws.com
The authenticity of host 'ec2-3-82-209-50.compute-1.amazonaws.com (3.82.209.50)' can't be established.
ECDSA key fingerprint is SHA256:Jtb8yT2dCoX36gavYwgKzN5MhQ8SO3yktN9mgO8QcS4.
Are you sure you want to continue connecting (yes/no)?
```
3. Type `yes` to continue

```
vanshika@ec2-54-172-224-0.compute-1.amazonaws.com's password:
```  
4. Type password `vanshika`

## Building the project ##
5. Type the following commands to navigate to the project
```
$ ls
LuceneCranfield
$ cd LuceneCranfield/
~/LuceneCranfield$ mvn package  
```
6. The project should build successfully. Run the project by the command-  
```
~/LuceneCranfield$ java -jar target/inforetrieval-0.0.1-SNAPSHOT.jar  
```  
7. The console output of the project should look something like
```
Files parsed successfully
Indexing to directory 'src/index'...
2583 total milliseconds
```  
## Generate MAP and Recall score ##   
8. Enter the `trec_eval` folder
```
~/LuceneCranfield$ cd src/trec_eval/
```  
9. Perform `make` to generate a trec_eval executable file
    - ignore if make has been performed  
10. Compare the two files  
    - Desired result file: Qrel.test
    - Observed result file: cran.results
```
~/LuceneCranfield/src/trec_eval$ ./trec_eval test/Qrel.test test/cran.results
```
