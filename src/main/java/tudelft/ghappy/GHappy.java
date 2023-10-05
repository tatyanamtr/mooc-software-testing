package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g' || str.charAt(i) == 'G') {
                if (i > 0 && (str.charAt(i-1) == 'g' || str.charAt(i-1) == 'G')) { return true; }
                if (i+1 < str.length() && (str.charAt(i+1) == 'g' || str.charAt(i+1) == 'G')) { return true; }

            }

        }

        return false;

    }
}
