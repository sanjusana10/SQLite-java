This is my coding file for Mulesoft internship program at NJC labs.
In this code I have created a database 'usersdb' and a table 'movie' in it. The table 'movie' contains three entries of movie details inserted by me. I learned to create a database in SQLite for this internship coding test,connect my SQLite database with java code and retrieving the records of table using java code and also learned to upload my code file from eclipse to github. 
In the program,
at line 12 "String jdbcUrl="jdbc:sqlite:/C:\\sqlite\\sqlite_tools\\usersdb.db";",I have got my source of database created in sqlite,
at line 14 "Connection connection= DriverManager.getConnection(jdbcUrl);", I have connected my database with java.
Then I have used "executequery" to excute the sql query I have written previously.
Then using while loop I have got the records in the table and printed in the console.
I have imported the following required packages to operate my database in sqlite in this java code:
"import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;"


