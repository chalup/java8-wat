import java.io.Serializable;

public class Java8Wat {
  interface Parcelable {
  }

  static class Bundle implements Parcelable {
    public void put(Parcelable parcelable) {
    }

    public void put(Serializable serializable) {
    }

    public <T extends Parcelable> T getParcelable() {
      return null;
    }
  }

  static {
    Bundle inBundle = new Bundle();
    Bundle outBundle = new Bundle();

    outBundle.put(inBundle.getParcelable());
  }
}
