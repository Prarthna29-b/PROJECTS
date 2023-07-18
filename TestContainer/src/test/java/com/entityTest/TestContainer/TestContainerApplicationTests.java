package com.entityTest.TestContainer;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.testcontainers.containers.MSSQLServerContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest

@Testcontainers
@TestConfiguration
class TestContainerApplicationTests {
	
@ServiceConnection
@Container
private static final MSSQLServerContainer<?> sqlServerContainer = new MSSQLServerContainer<>("mcr.microsoft.com/mssql/server:2022-latest").withReuse(true)
.acceptLicense();
@BeforeEach
public void setUp() {
    sqlServerContainer.start();
}

@AfterEach
public void tearDown() {
    sqlServerContainer.stop();
}


@Autowired
private StudentService studentService;

	@Test
	public void successList() throws Exception
	{
		Student student1 = new Student();
	    student1.setName("John");
	    Student student2 = new Student();
	    student2.setName("Jane");
	    studentService.save(student1);
	    studentService.save(student2);
    List<Student> studentList = studentService.listAll();  
	    assertEquals(2, studentList.size());
	    assertEquals("John", studentList.get(0).getName());
	    assertEquals("Jane", studentList.get(1).getName());
	}
	@Test
    public void unsuccessList() throws Exception {
        List<Student> studentList = studentService.listAll();
        assertEquals(0, studentList.size());
    }
}
