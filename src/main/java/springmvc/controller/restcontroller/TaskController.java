p a c k a g e   s p r i n g m v c . c o n t r o l l e r . r e s t c o n t r o l l e r ;  
  
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;  
 i m p o r t   j a v a . u t i l . L i s t ;  
 i m p o r t   j a v a . u t i l . M a p ;  
  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . h t t p . M e d i a T y p e ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . s t e r e o t y p e . C o n t r o l l e r ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . D e l e t e M a p p i n g ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . G e t M a p p i n g ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . P a t c h M a p p i n g ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . P a t h V a r i a b l e ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . P o s t M a p p i n g ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . R e q u e s t B o d y ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . R e q u e s t M a p p i n g ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . R e q u e s t P a r a m ;  
 i m p o r t   o r g . s p r i n g f r a m e w o r k . w e b . b i n d . a n n o t a t i o n . R e s p o n s e B o d y ;  
  
 @ C o n t r o l l e r  
 @ R e q u e s t M a p p i n g ( " / a p i " )  
 p u b l i c   c l a s s   T a s k C o n t r o l l e r   {  
 	  
         p r i v a t e   L i s t < T a s k >   t a s k s   =   n e w   A r r a y L i s t < > ( ) ;  
          
         @ G e t M a p p i n g ( v a l u e = " / t a s k s " ,     p r o d u c e s   =   M e d i a T y p e . A P P L I C A T I O N _ J S O N _ V A L U E )  
         @ R e s p o n s e B o d y  
         p u b l i c   L i s t < T a s k >   g e t T a s k s ( )   {  
                 r e t u r n   t a s k s ;  
         }  
          
         @ G e t M a p p i n g ( v a l u e = " t a s k s / { i d } " )  
         @ R e s p o n s e B o d y  
         p u b l i c   T a s k   g e t t a s k ( @ P a t h V a r i a b l e   i n t   i d ) {  
         	 r e t u r n   t a s k s . g e t ( i d ) ;  
         }  
  
         @ P o s t M a p p i n g ( " / t a s k s " )  
         @ R e s p o n s e B o d y  
         p u b l i c   S t r i n g   a d d T a s k ( @ R e q u e s t B o d y   T a s k   t a s k )   {  
                 t a s k s . a d d ( t a s k ) ;  
                 r e t u r n   " T a s k   a d d e d   s u c c e s s f u l l y ! " ;  
         }  
  
         @ P a t c h M a p p i n g ( " / t a s k s / { i n d e x } " )  
         @ R e s p o n s e B o d y  
         p u b l i c   S t r i n g   u p d a t e T a s k ( @ P a t h V a r i a b l e   i n t   i n d e x ,   @ R e q u e s t B o d y   M a p < S t r i n g ,   O b j e c t >   u p d a t e s )   {  
                 i f   ( i n d e x   <   0   | |   i n d e x   > =   t a s k s . s i z e ( ) )   {  
                         r e t u r n   " I n v a l i d   t a s k   i n d e x ! " ;  
                 }  
  
                 T a s k   t a s k   =   t a s k s . g e t ( i n d e x ) ;  
  
                 u p d a t e s . f o r E a c h ( ( k e y ,   v a l u e )   - >   {  
                         s w i t c h   ( k e y )   {  
                                 c a s e   " t i t l e " :  
                                         t a s k . s e t T i t l e ( ( S t r i n g )   v a l u e ) ;  
                                         b r e a k ;  
                                 c a s e   " d e s c r i p t i o n " :  
                                         t a s k . s e t D e s c r i p t i o n ( ( S t r i n g )   v a l u e ) ;  
                                         b r e a k ;  
                                 c a s e   " d o n e " :  
                                         t a s k . s e t D o n e ( ( B o o l e a n )   v a l u e ) ;  
                                         b r e a k ;  
                         }  
                 } ) ;  
  
                 r e t u r n   " T a s k   u p d a t e d   s u c c e s s f u l l y ! " ;  
         }  
  
  
         @ D e l e t e M a p p i n g ( " / t a s k s / { i n d e x } " )  
         @ R e s p o n s e B o d y  
         p u b l i c   S t r i n g   d e l e t e T a s k ( @ P a t h V a r i a b l e   i n t   i n d e x )   {  
                 i f   ( i n d e x   > =   0   & &   i n d e x   <   t a s k s . s i z e ( ) )   {  
                         t a s k s . r e m o v e ( i n d e x ) ;  
                         r e t u r n   " T a s k   d e l e t e d   s u c c e s s f u l l y ! " ;  
                 }  
                 r e t u r n   " I n v a l i d   t a s k   i n d e x . " ;  
         }  
 }  
  
  
 