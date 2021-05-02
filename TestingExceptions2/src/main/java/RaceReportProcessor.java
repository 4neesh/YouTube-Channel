import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class RaceReportProcessor {


    public void generateReport(String driverFileLocation, String racePerformanceLocation) throws Exception {

        FileInputStream driverInputStream = new FileInputStream(driverFileLocation);
        List<Driver> driverList = readFileToObjectList(driverInputStream);

        FileInputStream racePerformanceInputStream = new FileInputStream(racePerformanceLocation);
        List<RacePerformance> racePerformanceList = readFileToObjectList(racePerformanceInputStream);

        //combines data
        combineDriverAndRaceToReport(driverList, racePerformanceList);
    }

    private void combineDriverAndRaceToReport(List<Driver> driverList, List<RacePerformance> racePerformanceList) {

        //combine two reports into one and save it.

    }

    <T> List<T> readFileToObjectList(FileInputStream driverFile) throws IOException, ClassNotFoundException {

//        ObjectInputStream ois = new ObjectInputStream(driverFile);
//        List<T> objectList = new ArrayList<T>();
//        while (ois.readObject() != null) {
//            objectList.add((T) ois.readObject());
//        }
//        return objectList;
        return null;
    }


}
