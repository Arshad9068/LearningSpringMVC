p a c k a g e   s p r i n g m v c . c o n t r o l l e r . C o n t a c t C o n t r o l l e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e r v l e t R e q u e s t ;  
  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . s t e r e o t y p e . C o n t r o l l e r ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . u i . M o d e l ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . H t t p R e q u e s t H a n d l e r ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . R e q u e s t M a p p i n g ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . R e q u e s t M e t h o d ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . R e q u e s t P a r a m ;  
  
 @ C o n t r o l l e r  
 p u b l i c   c l a s s   C o n t a c t   {  
 	 @ R e q u e s t M a p p i n g ( " / s h o w c o n t a c t " )  
 	 p u b l i c   S t r i n g   s h o w C o n t a c t ( )   {  
 	 	 r e t u r n   " c o n t a c t " ;  
 	 }  
 	  
 	 @ R e q u e s t M a p p i n g ( p a t h = " / p r o c e s s f o r m " ,   m e t h o d   =   R e q u e s t M e t h o d . G E T )  
 	 p u b l i c   S t r i n g   h a n d l e F o r m ( @ R e q u e s t P a r a m   S t r i n g   e m a i l ,   @ R e q u e s t P a r a m   S t r i n g   u s e r N a m e ,   @ R e q u e s t P a r a m   S t r i n g   p a s s w o r d ,   M o d e l   m o d e l )   {  
 	 	 S y s t e m . o u t . p r i n t l n ( u s e r N a m e ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( e m a i l ) ;  
 	 	 S y s t e m . o u t . p r i n t l n ( p a s s w o r d ) ;  
 	 	  
 	 	 m o d e l . a d d A t t r i b u t e ( " e m a i l " ,   e m a i l ) ;  
 	 	 m o d e l . a d d A t t r i b u t e ( " u s e r N a m e " ,   u s e r N a m e ) ;  
 	 	 m o d e l . a d d A t t r i b u t e ( " p a s s w o r d " ,   p a s s w o r d ) ;  
 	 	 r e t u r n   " s u c c e s s " ;  
 	 }  
  
 }  
 