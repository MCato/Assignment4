package wordCount.Frequency;

import com.kennycason.kumo.nlp.FrequencyAnalyzer;
import com.kennycason.kumo.palette.ColorPalette;
import com.kennycason.kumo.bg.Background;
import com.kennycason.kumo.bg.RectangleBackground;
import com.kennycason.kumo.bg.PixelBoundryBackground;
import com.kennycason.kumo.CollisionMode;
import com.kennycason.kumo.WordCloud;
import com.kennycason.kumo.WordFrequency;
import com.kennycason.kumo.font.scale.LinearFontScalar;
import java.awt.*;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
import java.util.List;

import org.apache.commons.io.IOUtils;

/**
 * Word Cloud
 *
 */
public class Cloud{
	 private static InputStream inputStream;
	private static Charset characterEncoding;
	public static void main( String[] args ) throws IOException {
	        
final FrequencyAnalyzer frequencyAnalyzer = new FrequencyAnalyzer();
frequencyAnalyzer.setWordFrequenciesToReturn(300);
frequencyAnalyzer.setMinWordLength(4);
frequencyAnalyzer.setStopWords(loadStopWords());

final List<WordFrequency> wordFrequencies = frequencyAnalyzer.load(getInputStream("mobydick.txt"));
final Dimension dimension = new Dimension(500, 312);
final WordCloud wordCloud = new WordCloud(dimension, CollisionMode.PIXEL_PERFECT);
wordCloud.setPadding(2);
wordCloud.setBackground(new PixelBoundryBackground(getInputStream("backgrounds/whale_small.png")));
wordCloud.setColorPalette(new ColorPalette(new Color(0x4055F1), new Color(0x408DF1), new Color(0x40AAF1), new Color(0x40C5F1), new Color(0x40D3F1), new Color(0xFFFFFF)));
wordCloud.setFontScalar(new LinearFontScalar(10, 40));
wordCloud.build(wordFrequencies);
wordCloud.writeToFile("output/whale_wordcloud_small.png");

}
	private static Collection<String> loadStopWords() {
		// TODO Auto-generated method stub
		return null;
	}
	private static InputStream getInputStream(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
			 
}
