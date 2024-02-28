package zad8;

public class ParcelValidator  implements Validator{

    @Override
    public boolean validate(Parcel input) {
        return (input.xLength + input.yLength + input.zLength < 300)
                && input.xLength > 30 && input.yLength > 30 && input.zLength > 30
                && ((input.weight < 30 && !input.isExpress) || (input.weight < 15 && input.isExpress));
    }
}
