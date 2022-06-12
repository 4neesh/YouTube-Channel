import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet();
        List<FootballPlayer> playerList = createPlayerList();
        Object[][] playerDetailsArray = createPlayerArray();
        createHeaderRow(ws);
        int rowNumber = 1;
        for(Object[] player : playerDetailsArray){
            Row row = ws.createRow(rowNumber++);
            int columnNumber = 0;
            for(Object field: player){
                Cell cell = row.createCell(columnNumber);

                if(field instanceof  Integer){
                    cell.setCellValue((Integer) field);
                }
                else{
                    cell.setCellValue((String)field);
                }
                columnNumber++;
            }
       }
        try(FileOutputStream outputStream = new FileOutputStream("./playerWorkbook.xlsx")){
            wb.write(outputStream);
        }
        catch(Exception e){
            throw new RuntimeException(e);
        }

    }

    private static void createHeaderRow(XSSFSheet ws) {
        Row row = ws.createRow(0);
        List<String> headers = Arrays.asList("Name", "Age", "Games", "Goals", "Team", "League");
        for(int i = 0; i<headers.size(); i++){
            Cell headerCell = row.createCell(i);
            headerCell.setCellValue(headers.get(i));
        }
    }

    private static Object[][] createPlayerArray() {
        List<FootballPlayer> footballPlayerList = createPlayerList();
        Object[][] playerArray = new Object[footballPlayerList.size()][6];

        int playerIndexNumber = 0;
        for(FootballPlayer player: footballPlayerList){

            playerArray[playerIndexNumber][0] = player.getName();
            playerArray[playerIndexNumber][1] = player.getAge();
            playerArray[playerIndexNumber][2] = player.getGames();
            playerArray[playerIndexNumber][3] = player.getGoals();
            playerArray[playerIndexNumber][4] = player.getTeam();
            playerArray[playerIndexNumber][5] = player.getLeague();
            playerIndexNumber++;
        }

        return playerArray;
    }

    private static List<FootballPlayer> createPlayerList() {

        List<FootballPlayer> playerList = new ArrayList<>();

        FootballPlayer player1 = FootballPlayer.builder().name("Adam").age(20).games(10).goals(4).league("Premier").team("Blues").build();
        FootballPlayer player2 = FootballPlayer.builder().name("Bob").age(24).games(11).goals(19).league("League 1").team("City").build();
        FootballPlayer player3 = FootballPlayer.builder().name("Charlie").age(25).games(10).goals(2).league("Premier").team("Blues").build();
        FootballPlayer player4 = FootballPlayer.builder().name("Dean").age(28).games(10).goals(1).league("Premier").team("Reds").build();
        FootballPlayer player5 = FootballPlayer.builder().name("Elias").age(33).games(9).goals(0).league("Premier").team("Reds").build();
        FootballPlayer player6 = FootballPlayer.builder().name("Frazer").age(31).games(7).goals(12).league("Premier").team("Reds").build();
        FootballPlayer player7 = FootballPlayer.builder().name("Grant").age(22).games(18).goals(14).league("League 1").team("United").build();
        FootballPlayer player8 = FootballPlayer.builder().name("Harry").age(19).games(17).goals(16).league("League 1").team("City").build();

        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);
        playerList.add(player6);
        playerList.add(player7);
        playerList.add(player8);

        return playerList;
    }
}
