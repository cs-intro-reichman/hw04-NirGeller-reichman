public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        
        String[] lowerCaseKeywords = new String[keywords.length];
        for(int i =0; i < keywords.length; i++){
            lowerCaseKeywords[i] = keywords[i].toLowerCase();
        }

        for(int i = 0; i < sentences.length; i++){
            String originalSentence = sentences[i];
            String lowerCaseSentence = originalSentence.toLowerCase();
            int sentenceLength = lowerCaseSentence.length();
            
            boolean foundKeyword = false;

            for(int j = 0; j < lowerCaseKeywords.length; j++){
                String keyword = lowerCaseKeywords[j];
                int keywordLength = keyword.length();
                
                if (sentenceLength >=keywordLength) {
                    for(int k = 0; k <= sentenceLength - keywordLength; k++){
                        
                    if(lowerCaseSentence.charAt(k) == keyword.charAt(0)){
                            
                    boolean match = true;
                            
                    for(int l = 1; l < keywordLength; l++){
                     if(lowerCaseSentence.charAt(k + l) != keyword.charAt(l)){
                            match = false;
                            break;
                          }
                      }
                            
                    if(match){
                     foundKeyword = true;
                     break;
             }
             }
         }
     }
                
                if(foundKeyword){
                    break;
                }
            }

            if(foundKeyword){
                System.out.println(originalSentence);
            }
        }
    }
}