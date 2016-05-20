package dataMining_HW3;
import weka.associations.Apriori;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

//
public class test {
	public static void main(String[] args) throws Exception {
		String data="C:/Program Files/Weka-3-8/data/weather.nominal.arff";
		DataSource source=new DataSource(data);
		
		Instances dataI=source.getDataSet();
		
		Apriori model=new Apriori();
		
		model.buildAssociations(dataI);
		
		System.out.print(model);
	}
}
