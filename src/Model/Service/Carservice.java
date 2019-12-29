package Model.Service;

import Model.Entityy.CarEnti;
import Model.Repository.CarRepo;
import java.util.List;

public class Carservice {
    private static Carservice ourInstance = new Carservice();


             public static Carservice getInstance() {
                 return ourInstance;
             }


             private Carservice() {
             }




             public void buy(CarEnti carEntity) throws Exception{
                 try (CarRepo carRepository = new CarRepo()){
                         carEntity.setPrise(carEntity.getPrise()*1000000);
                         carEntity.setPrise((long) (carEntity.getPrise() - (0.05 * carEntity.getPrise())));
                         carRepository.insert(carEntity);
                         carRepository.commit();
                     }
             }


         public void sell(int number) throws Exception{
                 try (CarRepo carRepository = new CarRepo()){
                         carRepository.delete(number);
                         carRepository.commit();
                     }
             }

               public List<CarEnti> report() throws Exception{
                 List<CarEnti> carEntities;
                 try (CarRepo carRepository = new CarRepo()){
                         carEntities = carRepository.select();
                         carRepository.commit();
                     }
                 return carEntities;
             }



         }
