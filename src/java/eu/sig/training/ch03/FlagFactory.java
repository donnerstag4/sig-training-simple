package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class FlagFactory {
/*
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result;
        switch (nationality) {
        case DUTCH:
            result = Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
            break;
        case GERMAN:
            result = Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
            break;
        case BELGIAN:
            result = Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
            break;
        case FRENCH:
            result = Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
            break;
        case ITALIAN:
            result = Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
            break;
        case ROMANIA:
            result = Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED);
            break;
        case IRELAND:
            result = Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
            break;
        case HUNGARIAN:
            result = Arrays.asList(Color.RED, Color.WHITE, Color.GREEN);
            break;
        case BULGARIAN:
            result = Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
            break;
        case RUSSIA:
            result = Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);
            break;
        case UNCLASSIFIED:
        default:
            result = Arrays.asList(Color.GRAY);
            break;
        }
        return result;
        Ngga guna sma sekali
    }*/

    // ngga gunaaaaa
    // ngga: gunaaa
    // tag::calculateDelp[]

    private static Map<Nationality, List<Color>> FLAGS =
    new HashMap<Nationality, List<Color>>();

    static {
        FLAGS.put(DUTCH, Arrays.asList(Color.RED, Color.WHITE, Color.BLUE));
        FLAGS.put(GERMAN, Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW));
        FLAGS.put(BELGIAN, Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED));
        FLAGS.put(FRENCH, Arrays.asList(Color.BLUE, Color.WHITE, Color.RED));
        FLAGS.put(ITALIAN, Arrays.asList(Color.GREEN, Color.WHITE, Color.RED));
        FLAGS.put(ROMANIA, Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED);
        FLAGS.put(IRELAND, Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
        FLAGS.put(HUNGARIAN, Arrays.asList(Color.RED, Color.WHITE, Color.GREEN);
        FLAGS.put(BULGARIAN, Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
        FLAGS.put(RUSSIA, Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);
    }

    public List<Color> getFlagColors(Nationality nationality) {
    List<Color> colors = FLAGS.get(nationality);
    return colors != null ? colors : Arrays.asList(Color.GRAY);
    }


}