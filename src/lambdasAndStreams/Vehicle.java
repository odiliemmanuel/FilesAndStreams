package lambdasAndStreams;

@FunctionalInterface
public interface Vehicle {

        double accelerate(double speed);

        static double decelerate(double speed){
            return 0;
        }
}
