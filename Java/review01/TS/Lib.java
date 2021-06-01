package TS;  

class Lib {
    public static void variableDemo() {
        /*
        @ variable
        ===
        - concept: box
        - pattern: TNV
        - feature:
            ~ primitive types vs wrapped types
                | primitive types   | wrapped types |
                =====================================
                | char              | Character     |
                | int               | Integer       |
                | double            | Double        |
                | bool              | Boolean       |
                
            ~ type traits
                $ so called "meta types"

            ~ type limits
                $ overflow
                $ underflow
                
            ~ type conversion
                $ implicit vs explicit
                $ downcasting vs upcasting
                $ narrowing

            ~ [x]variable templated
            ~ Val, Ref, Ptr
                $ lvalue, rvalue
                $ lref, rref
                $ raw ptr, smart_ptr, unique_ptr, weak_ptr
            
            ~ initialization
                $ resource acquisiton is initialization
                $ pattern:
                    % `T varName = Val;`
                    % `T varName(Val);`
                    % `T varName{Val};`
                    % `T varName = T(Val);`
                    % `T varName = T{Val};`

            ~ storage
                $ static
                $ auto
                $ register
                $ extern
                $ const
            
            ~ access
                $ private
                $ public
            
            ~ keywords
                $ const
                $ static
                $ marcro
                $ inline
        ===
        */ 
    }

    public static void functionDemo() {
        /*
        @ function
        ===
        - concept: black box
        - pattern: TNP
        - feature:
            ~ regular
            ~ anonymous
            ~ lambda
            ~ immediate

            ~ function ptr
            ~ delegate
            ~ event(side effect)

            ~ decorator
            ~ generator

            ~ nested function
            ~ nested class in function

            ~ return type
                $ ByVal
                $ ByRef
                $ ByPtr
            
            ~ function name
                $ override
                $ overload
                $ function template(generic)
            
            ~ args
                $ so called "signature"(types, quantity)
                $ arguments(actual outer) vs paramters(inner)
                $ params
                $ in, out, ref

            ~ const correctness
                $ constraints return_type
                $ constraints function_name
                $ constraints args
        ===
        */ 
    }

    public static void statementDemo() {
        /*
        @ statement
        ===
        - concept: link
        - pattern: link
        - feature:
            ~ Arithmetic
                $ + - * / %
                $ (prefix)++ --; (post)++ --

            ~ Relational
                $ ==, !=
                $ >, >=
                $ <, <=

            ~ Logic
                $ !
                $ &&
                $ ||

            ~ Access
                $ [x] (*ptr).
                $ .

            ~ Bitwise
                $ <<, >>
                $ ~
                $ &
                $ |

            ~ Assign
                $ =
                $ `T varName = Val;`
                $ `T varName(Val);`
                $ `T varName{Val};`
                $ `T varName = T(Val);`
                $ `T varName = T{Val};`

            ~ Cast
                $ dynamic_cast<T*>(U*)
                $ static_cast<T>(U)
                $ const_cast<T*>(U*)
                $ reinterpret_cast<T>(U)
                $ (C-Style)U;

            ~ Op for storage
                $ new
                $ delete

            ~ Op for other
                $ ()
                $ []
                $ {}
                $ <>
        ===
        */ 

    }

    public static void controlflowDemo() {
        /*
        @ controlflow
        ===
        - concept: branch
        - pattern: branch
        - feature:
            ~ if...else if...else
            ~ switch...case...default
            ~ try...catch...finally

        ===
        */ 


    }

    public static void loopDemo() {
        /*
        @ loop
        ===
        - concept: circle
        - pattern: circle
        - feature:
            ~ for(;;)
            ~ for...in
            ~ forEach
            ~ while
            ~ do...while
        ===
        */ 
    }

    public static void classDemo() {
        /*
        @ class
        ===
        - concept: sim
        - pattern: sim
        - feature:
            ~ Abstractino
            ~ Encapsulation
            ~ Inheritance
            ~ Polymorphsim

        - principle:
            ~ SRP
            ~ OCP
            ~ LSP
            ~ ISP
            ~ DIP
        ===
        */ 


    }

    public static void interfaceDemo() {
        /*
        @ interface
        ===
        - concept: USB
        - pattern: USB
        - feature:
            ~ Abstract only
            ~ Declaration only
            ~
            
        - difference:
            | item      | abstract class | interface     |
            ==============================================
            | concept   | blue print     | commual parts |
            | what      | not full A     | full A        |
            | keyword   | abstract       | interface     |
            | property? | yes            | no            |
            | methods   | may implement  | no            |
            | inherit   | yes from abs   | yes from int  |
        ===
        */ 


    }

    public static void datastructureDemo() {
        /*
        @ data structure
        ===
        - concept: container
        - pattern: container
        - feature:
            ~ seq
                $ array
                $ vector
                $ list
                $ forward_list
                $ dequeue
            
            ~ adaptor
                $ stack
                $ queue
                $ priority_queue

            ~ associative
                $ map
                $ multimap
                $ set
                $ multiset

                $ unordered_map
                $ unordered_multi_map
                $ unordered_set
                $ unordered_multi_set
        ===
        */ 
    }

    public static void algorithmDemo() {
        /*
        @ algorithm
        ===
        - concept: calc
        - pattern: calc
        - feature:
            ~ iterator, const_iterator
            ~ capacity
            ~ access
            ~ modification
            ~ list observation
            ~ bucket
            ~ hash policy

        - world map of STL algorithm:
            ~ permutation
            ~ ruin of secret
            ~ movers
            ~ changers
            ~ queries
            ~ value modifier
            ~ algos on sets
            ~ raw memory
        ===
        */
    }
}