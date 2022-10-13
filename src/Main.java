import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehiches.Car;
import com.company.vehiches.Lorry;
import com.company.vehiches.SportCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW","Легковое","1.5т",new Driver("Азамат Муратбеков","2 года"),new Engine("170 лошадиных сил","BMW"));
        System.out.println(car.toString());
        Lorry lorry = new Lorry("Huandai","Грузовой","2.5т",new Driver("Курманбек Мамбетомуров","3года"),new Engine("250 лошадиных сил","Huandai"),"3.5тон");
        System.out.println(lorry.toString());
        SportCar sportCar= new SportCar("Ferrari","СпортКар","1.3т",new Driver("Айдай Маматбекова","1год"),new Engine("400 лошадиных сил","Ferrari"),"300км/час");
        System.out.println(sportCar.toString());
    }
}