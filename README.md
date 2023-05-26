# hello
This repo demo how to use chatGPT to generate code



1. setup mysql database by docker container
   docker run --name mysql.server 
2.        -p 3306:3306 
3.        -e MYSQL_ROOT_PASSWORD=password -d 
4.        mysql:latest
 * 
 * docker run --name my-mysql -e MYSQL_ROOT_PASSWORD=root -v $HOME/mysql-data:/var/lib/mysql  -p 3306:3306 -d mysql:8.0