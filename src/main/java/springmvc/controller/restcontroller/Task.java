p a c k a g e   s p r i n g m v c . c o n t r o l l e r . r e s t c o n t r o l l e r ;  
  
 i m p o r t   j a v a x . s e r v l e t . h t t p . H t t p S e s s i o n ;  
  
 p u b l i c   c l a s s   T a s k   {  
 	 p r i v a t e   S t r i n g   t i t l e ;  
         p r i v a t e   S t r i n g   d e s c r i p t i o n ;  
         p r i v a t e   b o o l e a n   d o n e ;  
  
         p u b l i c   T a s k ( )   { }  
  
         p u b l i c   T a s k ( S t r i n g   t i t l e ,   S t r i n g   d e s c r i p t i o n ,   b o o l e a n   d o n e )   {  
                 t h i s . t i t l e   =   t i t l e ;  
                 t h i s . d e s c r i p t i o n   =   d e s c r i p t i o n ;  
                 t h i s . d o n e   =   d o n e ;  
         }  
  
         p u b l i c   S t r i n g   g e t T i t l e ( )   {  
                 r e t u r n   t i t l e ;  
         }  
  
         p u b l i c   v o i d   s e t T i t l e ( S t r i n g   t i t l e )   {  
                 t h i s . t i t l e   =   t i t l e ;  
         }  
  
         p u b l i c   S t r i n g   g e t D e s c r i p t i o n ( )   {  
                 r e t u r n   d e s c r i p t i o n ;  
         }  
  
         p u b l i c   v o i d   s e t D e s c r i p t i o n ( S t r i n g   d e s c r i p t i o n )   {  
                 t h i s . d e s c r i p t i o n   =   d e s c r i p t i o n ;  
         }  
  
         p u b l i c   b o o l e a n   i s D o n e ( )   {  
                 r e t u r n   d o n e ;  
         }  
  
         p u b l i c   v o i d   s e t D o n e ( b o o l e a n   d o n e )   {  
                 t h i s . d o n e   =   d o n e ;  
         }  
  
 }  
 