p a c k a g e   s p r i n g m v c . c o n t r o l l e r ;  
  
 i m p o r t   j a v a . t i m e . L o c a l D a t e T i m e ;  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . s t e r e o t y p e . C o n t r o l l e r ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . u i . M o d e l ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . R e q u e s t M a p p i n g ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . m e t h o d . s u p p o r t . M o d e l A n d V i e w C o n t a i n e r ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . s e r v l e t . M o d e l A n d V i e w ;  
  
 @ C o n t r o l l e r  
 p u b l i c   c l a s s   H o m e C o n t r o l l e r   {  
 	 @ R e q u e s t M a p p i n g ( " / h o m e " )  
 	 p u b l i c   S t r i n g   h o m e ( M o d e l   m o d e l )   {  
  
 	 	 m o d e l . a d d A t t r i b u t e ( " n a m e " ,   " A r s h a d   M a l i k " ) ;  
 	 	 m o d e l . a d d A t t r i b u t e ( " i d " ,   1 2 3 ) ;  
  
 	 	 L i s t < S t r i n g >   f r i e n d s   =   n e w   A r r a y L i s t < S t r i n g > ( ) ;  
 	 	 f r i e n d s . a d d ( " A r s h a d   M a l i k " ) ;  
 	 	 f r i e n d s . a d d ( " M o h d   D a n i s h " ) ;  
 	 	 f r i e n d s . a d d ( " M o h d   Q a s i m " ) ;  
 	 	 m o d e l . a d d A t t r i b u t e ( " f r n d " ,   f r i e n d s ) ;  
 	 	 r e t u r n   " h o m e " ;  
 	 }  
  
 	 @ R e q u e s t M a p p i n g ( " / a b o u t " )  
 	 p u b l i c   M o d e l A n d V i e w   a b o u t ( )   {  
  
 	 	 M o d e l A n d V i e w   m o d e l a n d v i e w   =   n e w   M o d e l A n d V i e w ( ) ;  
 	 	 m o d e l a n d v i e w . a d d O b j e c t ( " n a m e " ,   " A r s h a d   m a l i k " ) ;  
 	 	 m o d e l a n d v i e w . a d d O b j e c t ( " i d " ,   1 1 1 ) ;  
 	 	 L o c a l D a t e T i m e   d a t a t i m e   =   L o c a l D a t e T i m e . n o w ( ) ;  
 	 	 m o d e l a n d v i e w . a d d O b j e c t ( " d t " ,   d a t a t i m e ) ;  
 	 	 m o d e l a n d v i e w . s e t V i e w N a m e ( " a b o u t " ) ;  
  
 	 	 r e t u r n   m o d e l a n d v i e w ;  
 	 }  
 	 @ R e q u e s t M a p p i n g ( " / c o n t a c t U s " )  
 	 p u b l i c   M o d e l A n d V i e w   c o n t a c t U S ( )   {  
 	 	 M o d e l A n d V i e w   m o d e l A n d V i e w   =   n e w   M o d e l A n d V i e w ( ) ;  
 	 	 m o d e l A n d V i e w . a d d O b j e c t ( " n a m e " ,   " A r s h a d   m a l i k " ) ;  
 	 	 m o d e l A n d V i e w . a d d O b j e c t ( " i d " ,   1 1 1 ) ;  
 	 	 L o c a l D a t e T i m e   d a t a t i m e   =   L o c a l D a t e T i m e . n o w ( ) ;  
 	 	 m o d e l A n d V i e w . a d d O b j e c t ( " d t " ,   d a t a t i m e ) ;  
 	 	 m o d e l A n d V i e w . s e t V i e w N a m e ( " a b o u t " ) ;  
  
 	 	 r e t u r n   m o d e l A n d V i e w ;  
 	 }  
  
 }  
 