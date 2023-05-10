
public class MostraVideo {
	public static void main(String[] args) {
		VideoItem[] videoItens = new VideoItem[5];
		videoItens[0] = new VideoItem("The Batman", 7.9);
		videoItens[1] = new VideoItem("Star Wars III", 7.6);
		videoItens[2] = new VideoItem("Scarface", 8.3);
		videoItens[3] = new VideoItem("300", 7.6);
		videoItens[4] = new VideoItem("Watchmen", 7.6);
		
		Iterator videoIterator = new VideoIterator(videoItens);
		
		while (videoIterator.hasNext()) {
			VideoItem videoItem = (VideoItem)videoIterator.next();
			System.out.println(videoItem.nome + " -> nota no IMDB: " + videoItem.nota + "/10");
		}
		
	}
}
