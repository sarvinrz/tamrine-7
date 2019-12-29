package Model.Repository;

import Model.Entityy.CarEnti;
import java.sql.*;
import java.util.*;


         public class CarRepo implements AutoCloseable{
     private Connection connection;
     private PreparedStatement statement;
     public CarRepo() throws Exception{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                 connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "sarvin", "myjava123");
                 connection.setAutoCommit(false);
             }


             public void insert(CarEnti carEntity) throws SQLException {
                 statement =  connection.prepareStatement("insert into saipa(car_number, model, color, build, prise) values (?, ?, ?, ?, ?)");
                 statement.setInt(1, carEntity.getNumber());
                 statement.setString(2, carEntity.getModel());
                 statement.setString(3, carEntity.getColor());
                 statement.setInt(4, carEntity.getBuild());
                 statement.setLong(5, carEntity.getPrise());
                 statement.executeUpdate();
             }


             public void update(CarEnti carEntity) throws SQLException {
                 statement = connection.prepareStatement("update saipa set model = ?, color = ?, build = ?, prise = ?  where car_number = ?");
                 statement.setString(1, carEntity.getModel());
                 statement.setString(2, carEntity.getColor());
                 statement.setInt(3, carEntity.getBuild());
                 statement.setInt(4, carEntity.getNumber());
                 statement.setLong(5, carEntity.getPrise());
                 statement.executeUpdate();
             }


             public void delete(int number) throws SQLException {
                 statement = connection.prepareStatement("delete from saipa where car_number= ?");
                 statement.setInt(1, number);
                 statement.executeUpdate();
             }


             public List<CarEnti> select() throws SQLException {
                 statement = connection.prepareStatement("select * from saipa");
                 List<CarEnti> carEntityList = new ArrayList<>();
                 ResultSet resultSet = statement.executeQuery();
                 while (resultSet.next()){
                         CarEnti carEntity = new CarEnti().setNumber(resultSet.getInt("car_number")).setModel(resultSet.getString("model"));
                         carEntity.setColor(resultSet.getString("color")).setBuild(resultSet.getInt("build")).setPrise(resultSet.getLong("prise"));
                         carEntityList.add(carEntity);
                     }
                 return carEntityList;
             }


             public void commit() throws SQLException {
                 connection.commit();
             }
             public void rollback() throws SQLException {
                 connection.rollback();
             }
     @Override
     public void close() throws Exception {
                 statement.close();
                 connection.close();
             }
 }

