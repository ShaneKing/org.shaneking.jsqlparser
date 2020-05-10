package sktest.jsqlparser.util.deparser;

import net.sf.jsqlparser.JSQLParserException;
import org.junit.Assert;
import org.junit.Test;
import org.shaneking.jsqlparser.util.deparser.ExpressionDeParserUtils;
import org.shaneking.test.SKUnit;

public class ExpressionDeParserUtilsTest extends SKUnit {

  @Test
  public void addSchemaAliasPrefix() throws JSQLParserException {
    Assert.assertEquals("substr(t1.col1, 1, 4)", ExpressionDeParserUtils.addSchemaAliasPrefix("substr(col1,1,4)", "t1"));
    Assert.assertEquals("t1.col1 || t1.col2", ExpressionDeParserUtils.addSchemaAliasPrefix("col1||col2", "t1"));
  }
}
