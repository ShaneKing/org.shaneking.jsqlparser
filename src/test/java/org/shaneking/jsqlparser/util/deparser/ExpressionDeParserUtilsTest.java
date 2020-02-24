package org.shaneking.jsqlparser.util.deparser;

import net.sf.jsqlparser.JSQLParserException;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExpressionDeParserUtilsTest {

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void addSchemaAliasPrefix() throws JSQLParserException {
    Assert.assertEquals("substr(t1.col1, 1, 4)", ExpressionDeParserUtils.addSchemaAliasPrefix("substr(col1,1,4)", "t1"));
    Assert.assertEquals("t1.col1 || t1.col2", ExpressionDeParserUtils.addSchemaAliasPrefix("col1||col2", "t1"));
  }
}
