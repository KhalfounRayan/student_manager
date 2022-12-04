package student_linkedin.student_linkedin;




import java.sql.Connection;
import java.sql.Statement;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import student_management.student_management.CP;
import student_management.student_management.Student;
import student_management.student_management.StudentDao;

import org.junit.runner.RunWith;
import org.junit.runner.RunWith;

public class test {
 

		StudentDao student1 = new StudentDao();
		Student st=new Student("monNom","monPrenom","M1");
		
		//Test l'ajout d'etudiant dans la base
		@Test
		public void testInsertStud() {
			final boolean result = StudentDao.insertStudentRecordToDB(st);
			Assert.assertEquals(result,true);
			Assert.assertNotEquals(result,false);
		}
		//Test la suppression d'etudiant dans la base
		@Test
		public void testDeleteStudentRecordFromDB() {
			final boolean result = StudentDao.deleteStudentRecordFromDB(1);
			Assert.assertEquals(result,true);
			Assert.assertNotEquals(result,false);
		}
		
		//Test la modification d'etudiant dans la base
		@Test
		public void TestUpdateStudentRecord() {
			final boolean result = StudentDao.updateStudentRecord(3,"1",1,st);
			Assert.assertEquals(result,true);
			Assert.assertNotEquals(result,false);
		}
		
		
	
		  //Le test mockito ne fonctionne pas car notre CP a tester fonction grace a de smethode statique
		
		  @InjectMocks private CP con;
		  @Mock private Connection mockConnection;
		  @Mock private Statement mockStatement;

		  @Before
		  public void setUp() {
		    MockitoAnnotations.initMocks(this);
		  }
		 
		  @Test
		  public void testMockDBConnection() throws Exception {
			Mockito.when(mockConnection.createStatement()).thenReturn(mockStatement);
			Mockito.when(mockConnection.createStatement().executeUpdate(Mockito.any())).thenReturn(1);
			int value = con.executeQuery("");
		    Assert.assertEquals(value, 1);
		    Mockito.verify(mockConnection.createStatement(), Mockito.times(1));
		   
		  }
		  
		}

	

