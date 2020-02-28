package lucene;

import java.util.HashMap;

import lucene.indexer;
import lucene.parser;
import lucene.search_docs;

public class main {
	public static void main(String[] args) throws Exception {
		HashMap<Integer, HashMap<String, String>> processed_docs = parser.parse_docs();
		HashMap<Integer, String> processed_qrys = parser.parse_qrys();
		indexer.get_index(processed_docs);
		search_docs.search(processed_qrys);
	}

}
