
import java.util.*;

public class Test45 {

    public static void main(String[] args) {
        final char[][] B01 = {
            {'y', 'e', 'e', 'x', 'u', 'z', 'f'},
            {'d', 'a', 'r', 'p', 'y', 'y'},
            {'n', 'k', 'w', 'b', 'n', 'w'},
            {'j', 'h', 'q', 'b', 'p', 't', 'l'},
            {'z', 'p', 'q', 'y', 'm', 'x', 'i', 'w'},
            {'k', 'w', 'c', 'y', 'e', 'e'},
            {'d', 't', 'b'},
            {'w', 'u', 'y', 'e', 'e', 'x'},
            {'a', 'z', 'w', 'f', 'k'},
            {'l', 'd', 'z', 'b', 'v', 'j', 'w'},
            {'x', 't'},
            {'y', 'l'},
            {'h', 'c', 'p', 'l', 'd', 'z', 'b', 'v', 'j'},
            {'e', 'e', 'v', 'j', 'n'},
            {'h', 'k', 'w', 'u', 'y', 'e', 'e', 'x', 'u'},
            {'f', 'k', 'h'},
            {'y', 'u', 'b', 'g', 'd', 't'},
            {'p', 't', 'l', 'p', 'y', 'k', 'h'},
            {'m', 'x', 'i', 'w', 'd'},
            {'x', 't', 'm', 'p', 'j', 'h', 'q', 'b'},
            {'d', 'a', 'r', 'p', 'y'},
            {'e', 'v', 'j', 'n'},
            {'m', 'r', 'a', 'f', 'q'},
            {'e', 'p', 'c', 'j'},
            {'q', 's', 'x', 'r', 'a'},
            {'p', 's', 'x', 'p', 'c', 'e', 'w', 'h'},
            {'h', 'n', 'i'},
        };

        final char[][] P01 = {
            {'9', '3', 'n'},
            {'9', '5', 'v'},
            {'7', '1', 'v'},
            {'5', '8', 'n'},
            {'0', '6', 'n'},
            {'6', '3', 'n'},
            {'8', '6', 'v'},
            {'7', '3', 'n'},
            {'3', '2', 'n'},
            {'9', '0', 'n'},
            {'5', '6', 'v'},
            {'9', '3', 'v'},
            {'6', '0', 'n'},
            {'2', '5', 'n'},
            {'5', '3', 'n'},
            {'6', '2', 'v'},
            {'8', '2', 'v'},
            {'9', '8', 'n'},
            {'4', '6', 'n'},
            {'1', '8', 'n'},
            {'9', '5', 'v'},
            {'3', '5', 'n'},
            {'9', '1', 'n'},
            {'0', '9', 'n'},
            {'0', '7', 'n'},
            {'1', '6', 'v'},
            {'6', '4', 'v'},
        };

        final char[][] B02 = {
            {'m', 'h', 'g', 'v', 'a', 'h'},
            {'l', 'h', 'a'},
            {'m', 'i', 't', 'x', 'l'},
            {'l', 'y', 'l', 'e', 'v', 'f', 'h'},
            {'i', 'k', 'v', 'k', 'r', 'c', 'k', 'k', 'e'},
            {'q', 'a', 'h', 'u', 's', 'h', 'e'},
            {'v', 'x', 'h'},
            {'q', 'a', 'b', 'w'},
            {'r', 'p', 'a', 'x', 'k', 'f'},
            {'z', 'j', 'l', 'x', 'l'},
            {'w', 'd', 't', 'u', 'k', 'x', 't', 'p'},
            {'a', 'p', 'm', 'l'},
            {'i', 'a'},
            {'h', 'a'},
            {'z', 'd', 'm', 'r', 'x', 'o'},
            {'a', 't', 't', 'v'},
            {'e', 'z'},
            {'y', 'c', 'r', 'x', 'v', 'k', 'x', 'i'},
            {'k', 'r', 'c'},
            {'a', 't', 't', 'v', 'c', 'r', 'r'},
            {'k', 'i', 'h', 'n', 'i'},
            {'g', 'q', 's', 'i', 'l', 'h', 'a', 't'},
            {'x', 'k'},
            {'m', 'z', 'f', 'h', 'h', 'p', 'k', 'f'},
            {'d', 'i', 'f', 'w', 'd', 'u', 'w'},
            {'c', 'j', 'm'},
            {'z', 'i', 'k', 'v', 'k', 'r', 'c'},
            {'h', 'i', 'c', 'o', 'e', 'v', 'x', 'h'},
            {'a', 'j', 'h', 'l', 'h', 'c', 'a', 'e'},
            {'h', 'c', 'k'},
            {'e', 'm', 'z'},
            {'e', 'v', 'x', 'h', 't', 'h'},
            {'v', 'a', 'h'},
            {'c', 'q', 'm', 's', 'm', 'g', 'x'},
            {'v', 'c', 'r', 'r', 'r', 'a', 'o', 't'},
            {'p', 'o', 'o', 's', 'o'},
            {'l', 'h'},
            {'t', 'l', 'j', 'b', 'k', 'x', 'i', 'x', 'k'},
            {'k', 'k', 'e', 'f', 'g', 'u', 'o'},
            {'d', 'u', 't', 'n', 't', 't', 'h', 'l'},
            {'l', 'a', 'p', 'm', 'l', 'c', 'n', 'a', 'j'},
            {'a', 't', 't', 'v', 'c', 'r', 'r'},
            {'m', 'z', 'e'},
            {'l', 'h', 'c', 'a', 'e', 'z', 'd', 'l'},
            {'m', 'r', 'p', 'a', 'x', 'k', 'f'},
            {'d', 'i', 'f', 'w', 'd', 'u', 'w'},
            {'h', 'a', 'm', 'k'},
            {'x', 'h', 't', 'h', 'l'},
            {'s', 'h', 'e', 'j', 'c', 'r', 'n'},
            {'d', 'u', 't', 'n', 't'},
            {'h', 'e', 'j', 'c', 'r', 'n', 'w'},
            {'t', 'n', 't', 't', 'h', 'l'},
            {'p', 'o', 'o', 's', 'o', 'u'},
            {'j', 'b', 'k', 'x', 'i', 'x', 'k', 't'},
            {'v', 'c', 'r', 'r', 'r', 'a', 'o'},
            {'a', 't', 't', 'v', 'c', 'r', 'r'},
            {'u', 't', 'n', 't', 't', 'h', 'l', 's'},
            {'b', 'x', 'a', 'y', 'c', 'r'},
            {'i', 'l', 'y'},
            {'i', 'k', 'v', 'k', 'r'},
            {'r', 'p', 'a', 'x'},
            {'t', 'n', 't', 't', 'h', 'l', 's', 'i', 'e'},
            {'o', 's', 'o', 'u', 'e', 'u', 'x', 'f', 'x'},
            {'l', 'b', 'r', 'q', 'k', 'z'},
            {'e', 'j'},
            {'e', 'z', 'd', 'l', 'k', 'w', 'a'},
            {'i', 't', 'x', 'l', 'a', 'r', 'q'},
            {'e', 'v'},
            {'s', 'm'},
            {'f', 'h', 'h', 'p', 'k', 'f', 'c'},
            {'g', 'x', 'm', 'i', 'd', 'i', 'f', 'w', 'd'},
            {'z', 'i', 'k', 'v', 'k', 'r'},
        };

        final char[][] P02 = {
            {'5', '0', 'v'},
            {'3', '4', 'v'},
            {'5', '8', 'v'},
            {'4', '5', 'v'},
            {'3', '3', 'n'},
            {'3', '1', 'n'},
            {'8', '6', 'v'},
            {'1', '4', 'v'},
            {'7', '3', 'v'},
            {'2', '9', 'v'},
            {'1', '7', 'v'},
            {'9', '0', 'n'},
            {'4', '4', 'n'},
            {'4', '0', 'v'},
            {'6', '8', 'v'},
            {'3', '6', 'v'},
            {'8', '5', 'n'},
            {'4', '6', 'n'},
            {'6', '3', 'n'},
            {'3', '6', 'v'},
            {'9', '6', 'v'},
            {'3', '0', 'v'},
            {'7', '6', 'v'},
            {'5', '8', 'n'},
            {'9', '2', 'n'},
            {'5', '6', 'v'},
            {'2', '3', 'n'},
            {'8', '1', 'v'},
            {'1', '5', 'n'},
            {'0', '4', 'v'},
            {'4', '8', 'n'},
            {'8', '5', 'v'},
            {'5', '3', 'v'},
            {'0', '2', 'n'},
            {'3', '9', 'v'},
            {'7', '4', 'n'},
            {'8', '0', 'v'},
            {'3', '7', 'n'},
            {'9', '3', 'n'},
            {'6', '9', 'n'},
            {'8', '0', 'n'},
            {'3', '6', 'v'},
            {'2', '2', 'v'},
            {'4', '5', 'n'},
            {'7', '2', 'v'},
            {'9', '2', 'n'},
            {'4', '0', 'v'},
            {'8', '7', 'v'},
            {'7', '1', 'n'},
            {'6', '9', 'n'},
            {'8', '1', 'n'},
            {'8', '9', 'n'},
            {'7', '4', 'n'},
            {'5', '7', 'n'},
            {'3', '9', 'v'},
            {'3', '6', 'v'},
            {'7', '9', 'n'},
            {'1', '6', 'n'},
            {'4', '4', 'v'},
            {'3', '3', 'n'},
            {'7', '3', 'v'},
            {'8', '9', 'n'},
            {'9', '4', 'n'},
            {'0', '8', 'v'},
            {'2', '4', 'v'},
            {'8', '5', 'n'},
            {'5', '9', 'v'},
            {'8', '5', 'v'},
            {'3', '2', 'n'},
            {'7', '8', 'n'},
            {'5', '2', 'n'},
            {'2', '3', 'n'},
        };

        final char[][] B03 = {
            {'e', 'y', 'i', 'a', 'y'},
            {'i', 'a', 'g', 'e', 'q'},
            {'b', 'a', 'i'},
            {'j', 'n', 'n', 'q'},
            {'h', 'q', 'p', 'e'},
            {'z', 'w', 'n', 's'},
            {'t', 'c'},
            {'z', 'u', 'n', 'b', 'r', 'm', 'd'},
            {'m', 's', 'i', 't', 'k', 'n', 'i'},
            {'j', 'l', 'w', 'y', 'z', 'z', 'q', 'h'},
            {'b', 'r', 'm', 'd'},
            {'h', 'h', 'k', 'j', 'd', 'w', 'a', 'w', 'q'},
            {'g', 'e', 'q', 'a', 'n', 'd'},
            {'z', 'z', 'q'},
            {'s', 'i'},
            {'j', 'k', 'q', 'd', 'o', 'n', 'g', 'p', 'x'},
            {'j', 'l', 'w', 'y', 'z', 'z'},
            {'b', 'y', 'o'},
            {'z', 'i', 'x', 'b', 'q', 'p', 'b', 'h', 'h'},
            {'n', 'b'},
            {'i', 'o', 'f', 'u', 'e', 'b', 'l', 'v', 'e'},
            {'b', 'q', 'p'},
            {'m', 'h', 'c'},
            {'p', 'i', 'o', 'e', 'w', 'n', 's', 'k'},
            {'b', 'q'},
            {'q', 'o', 's', 'y'},
            {'y', 'i', 'a', 'y', 'f', 'n'},
            {'n', 'n', 'q', 'y', 'e', 'a', 'r', 'x'},
            {'n', 'i', 'c', 'w', 't', 's', 's', 'z', 'w'},
            {'y', 'f', 'q', 'h', 'd', 'n'},
            {'z', 'j', 'e', 'v', 'b', 'e'},
            {'v', 'l'},
            {'o', 'f', 'u', 'e', 'b'},
            {'e', 'z'},
            {'u', 's', 'z', 'b', 't', 'c', 'j'},
            {'e', 'l', 'q', 'o', 'q', 'h', 'e', 'w', 'j'},
            {'q', 'a', 'n', 'd', 'u', 'u', 'k'},
            {'q', 'y', 'e', 'a', 'r', 'x', 'x', 'd', 'd'},
            {'u', 'n', 'b'},
            {'a', 'y', 'f', 'n', 'p', 'm', 'h', 'c'},
            {'e', 'q', 'a', 'n'},
            {'a', 'y', 'b', 'a', 'i', 'y', 'j', 'o'},
            {'l', 'q', 'a', 'v', 'z', 's', 'l', 'w', 'u'},
            {'z', 'j', 'd', 'g', 'j', 'k', 'a', 'd'},
            {'l', 'q', 'o'},
            {'t', 'y', 't', 'n', 'l'},
            {'y', 'b', 'a', 'i', 'y', 'j'},
            {'l', 'w'},
            {'v', 'y'},
            {'g', 'e', 't', 'y', 't', 'n', 'l', 'q'},
            {'e', 'q', 'a'},
            {'m', 'c', 'y', 'l', 'i', 'c', 'v', 'j'},
            {'q', 'j', 'n', 'n'},
            {'c', 'v', 'y', 'n', 'n', 'q', 'o', 'z'},
            {'y', 'n', 'n', 'q', 'o', 'z', 'w', 'n'},
            {'g', 'g', 'f', 'y', 'l'},
            {'p', 'b', 'h', 'h', 'k'},
            {'q', 'm', 'c', 'z', 'z', 'j'},
            {'l', 'v', 'e', 'q'},
            {'v', 'y', 'n', 'n', 'q'},
            {'c', 'w'},
            {'i', 'o', 'f', 'u', 'e', 'b'},
            {'p', 'b', 'h', 'h', 'k', 'j', 'd', 'w'},
            {'q', 'h'},
            {'p', 'm', 'h', 'c', 'm', 'x', 'b', 'l'},
            {'i', 'c', 'w', 't', 's', 's', 'z'},
            {'y', 'l'},
            {'a', 'n'},
            {'m', 'c'},
            {'s', 'v', 'l'},
            {'n', 'b', 'r', 'm'},
            {'e', 'q', 'r'},
            {'q', 'q', 'a', 'g', 'y', 'f', 'q', 'h', 'd'},
            {'d', 'u', 'u', 'k', 't', 'd', 'v'},
            {'c', 'z', 'z', 'j', 'd', 'g', 'j', 'k', 'a'},
            {'f', 'u'},
            {'j', 'l', 'w'},
            {'g', 'g', 'f', 'y', 'l', 'v', 'k', 'w'},
            {'z', 'u'},
            {'y', 'e', 'o', 'q', 'e', 'j', 'u', 't'},
            {'e', 'k', 'p', 'i', 'o', 'e', 'w', 'n'},
        };

        final char[][] P03 = {
            {'4', '1', 'v'},
            {'9', '2', 'v'},
            {'3', '4', 'n'},
            {'3', '7', 'n'},
            {'8', '6', 'n'},
            {'7', '8', 'n'},
            {'3', '5', 'v'},
            {'6', '0', 'n'},
            {'5', '2', 'v'},
            {'7', '4', 'v'},
            {'9', '0', 'n'},
            {'0', '7', 'v'},
            {'9', '4', 'v'},
            {'7', '8', 'v'},
            {'5', '3', 'v'},
            {'3', '7', 'v'},
            {'7', '4', 'v'},
            {'0', '6', 'n'},
            {'0', '0', 'v'},
            {'8', '0', 'n'},
            {'0', '1', 'n'},
            {'0', '3', 'v'},
            {'4', '9', 'v'},
            {'4', '8', 'n'},
            {'0', '3', 'v'},
            {'1', '2', 'n'},
            {'4', '2', 'v'},
            {'4', '7', 'n'},
            {'5', '7', 'v'},
            {'1', '6', 'v'},
            {'0', '0', 'n'},
            {'6', '3', 'n'},
            {'1', '1', 'n'},
            {'7', '8', 'v'},
            {'3', '1', 'v'},
            {'8', '1', 'v'},
            {'9', '6', 'v'},
            {'6', '7', 'n'},
            {'7', '0', 'n'},
            {'4', '4', 'v'},
            {'9', '5', 'v'},
            {'1', '4', 'n'},
            {'7', '3', 'n'},
            {'7', '9', 'n'},
            {'8', '2', 'v'},
            {'3', '5', 'n'},
            {'2', '4', 'n'},
            {'7', '5', 'v'},
            {'6', '3', 'v'},
            {'1', '5', 'n'},
            {'9', '5', 'v'},
            {'5', '2', 'n'},
            {'2', '7', 'n'},
            {'6', '2', 'v'},
            {'6', '4', 'v'},
            {'9', '4', 'n'},
            {'0', '5', 'v'},
            {'3', '9', 'n'},
            {'6', '1', 'n'},
            {'6', '3', 'v'},
            {'5', '9', 'v'},
            {'0', '1', 'n'},
            {'0', '5', 'v'},
            {'1', '8', 'v'},
            {'4', '8', 'v'},
            {'5', '8', 'v'},
            {'7', '2', 'v'},
            {'9', '7', 'v'},
            {'4', '9', 'n'},
            {'5', '3', 'n'},
            {'8', '0', 'n'},
            {'8', '1', 'n'},
            {'1', '2', 'v'},
            {'9', '9', 'v'},
            {'5', '9', 'n'},
            {'2', '1', 'n'},
            {'7', '4', 'v'},
            {'9', '4', 'n'},
            {'6', '0', 'n'},
            {'2', '4', 'v'},
            {'2', '8', 'n'},
        };

        final char[][] B04 = {
            {'k', 'k', 'h', 'p', 'j', 'a'},
            {'h', 'm'},
            {'b', 'z', 'q', 'i', 'o', 'e', 'j', 's', 'f'},
            {'d', 'w', 'q'},
            {'q', 'd'},
            {'w', 'f', 'k'},
            {'z', 'd', 'l', 'j', 'r'},
            {'a', 'b', 'z', 'q', 'i', 'o', 'e', 'j', 's'},
            {'w', 'j', 'r', 'a', 'w', 'o', 'c', 'l'},
            {'q', 'u', 'u', 'k', 'h', 'a', 'u', 'z', 'k'},
        };

        final char[][] P04 = {
            {'9', '0', 'v'},
            {'8', '9', 'n'},
            {'7', '6', 'n'},
            {'3', '2', 'v'},
            {'3', '4', 'n'},
            {'0', '9', 'n'},
            {'1', '5', 'n'},
            {'6', '6', 'n'},
            {'7', '9', 'v'},
            {'1', '0', 'n'},
        };

        final char[][] B05 = {
            {'p', 'e', 'b', 'n', 'p', 't'},
            {'q', 'm', 'm', 'l', 'd', 'h'},
            {'f', 'l', 'x', 'j', 'q', 'e', 'r', 'i', 'm'},
            {'d', 'o'},
            {'s', 'k', 'q', 'p', 'm', 'r', 'o'},
            {'j', 'p', 'k', 'z'},
            {'x', 'j', 'q', 'e', 'r', 'i', 'm'},
            {'x', 'i', 'x', 'e', 'b', 'n', 'p', 't'},
            {'e', 'q', 'u', 'd', 'f', 'b'},
            {'d', 'b', 'k', 'p'},
            {'m', 'x', 'd'},
            {'o', 'w', 'x', 'r', 'n', 'd', 'b'},
            {'r', 'n', 'd', 'b', 'o', 'r', 'j'},
            {'g', 'd', 'm', 'c', 'g', 'i'},
            {'c', 'l', 's', 'o', 'e', 's', 'p'},
            {'l', 'x', 'm', 'b', 'g', 'f'},
            {'b', 'p', 'n', 'r', 'b', 'b', 'e'},
            {'q', 'd', 'o'},
            {'d', 'j', 'a', 'l', 'r', 'n', 'i', 'n', 'e'},
            {'d', 'h', 'm'},
            {'q', 'd', 'o', 'n', 'h', 'l', 'p', 't'},
            {'y', 'f', 'm', 'p', 'x', 'p', 'd'},
        };

        final char[][] P05 = {
            {'9', '8', 'n'},
            {'0', '2', 'n'},
            {'7', '5', 'n'},
            {'4', '2', 'v'},
            {'3', '6', 'n'},
            {'7', '1', 'n'},
            {'9', '5', 'n'},
            {'7', '8', 'n'},
            {'8', '0', 'n'},
            {'3', '0', 'n'},
            {'6', '2', 'n'},
            {'9', '6', 'v'},
            {'9', '9', 'v'},
            {'1', '0', 'v'},
            {'3', '1', 'v'},
            {'0', '9', 'n'},
            {'6', '9', 'n'},
            {'0', '4', 'v'},
            {'8', '2', 'v'},
            {'4', '2', 'n'},
            {'0', '4', 'v'},
            {'7', '4', 'v'},
        };

        final char[][] B06 = {
            {'c', 'w', 'q', 's', 'y', 'r', 'r', 'i', 'f'},
            {'f', 'f', 'q'},
            {'n', 'g'},
            {'k', 'n', 'h', 'a', 'g', 'b', 'p', 'h', 'm'},
            {'f', 'f', 'q', 'b', 'd'},
            {'x', 'b', 'm', 'j', 'k', 'i'},
            {'o', 'l'},
            {'f', 'i'},
            {'i', 't', 'c', 'w', 'q', 's', 'y'},
            {'k', 'g', 'c', 'g', 'h', 'e', 'i', 't'},
            {'n', 'h', 'o', 'l', 'u', 'h', 'b', 'j'},
            {'s', 'u', 'u', 'a', 'j'},
            {'o', 'x', 'b', 'm', 'j'},
            {'o', 'j'},
            {'o', 'm', 'e', 'n'},
            {'l', 'o', 'l', 'b', 't', 'm', 'o', 'm', 's'},
            {'m', 'w', 'h', 'r', 'u'},
            {'c', 'e', 'c', 'h'},
            {'o', 'l', 'b', 't', 'm', 'o', 'm', 's'},
            {'v', 'n', 'j', 'x', 'l'},
            {'c', 'o', 'w', 'j'},
            {'m', 'o', 'j', 'c', 'm', 'w', 'v', 'f', 'h'},
            {'o', 'k', 'n', 'x', 'u'},
            {'u', 'h', 't', 'q', 'b', 'k', 'q', 'y', 'o'},
            {'j', 'c', 'm', 'w', 'v', 'f', 'h'},
            {'h', 'b', 'j', 'd', 's', 'h', 'o'},
            {'n', 'g', 'l', 'q', 'j', 'c', 'p'},
            {'n', 'm', 'c', 'o', 'w'},
            {'u', 'e', 'h', 'r'},
            {'m', 'c', 'o', 'w', 'j', 'k', 'b', 'a'},
            {'f', 'n', 'o', 'k', 'n', 'x', 'u', 'l', 'o'},
            {'n', 'e', 'a'},
            {'e', 'm', 'm', 'm', 'n'},
            {'l', 'r', 'g', 'm', 'n', 's', 'z', 't'},
            {'l', 'b', 'c'},
            {'t', 'y', 'g', 'g', 'h', 'n'},
            {'r', 'b', 'e', 'r', 's', 'f'},
            {'p', 'v', 's'},
            {'r', 'l', 'x'},
            {'g', 'b', 'g'},
            {'f', 'i'},
            {'d', 'r', 'm', 'b', 'u', 'p', 'v', 's'},
            {'u', 'h', 'b', 'j'},
            {'r', 'b', 'e'},
            {'f', 'i'},
            {'h', 'i', 'd', 'b', 'm', 'h', 'n', 'q', 'p'},
            {'w', 'l'},
        };

        final char[][] P06 = {
            {'9', '9', 'v'},
            {'4', '1', 'n'},
            {'7', '3', 'v'},
            {'8', '9', 'v'},
            {'4', '1', 'n'},
            {'6', '0', 'n'},
            {'6', '5', 'n'},
            {'1', '7', 'n'},
            {'9', '7', 'v'},
            {'9', '1', 'v'},
            {'4', '5', 'n'},
            {'3', '7', 'n'},
            {'5', '0', 'n'},
            {'0', '5', 'v'},
            {'4', '3', 'n'},
            {'4', '8', 'v'},
            {'5', '3', 'v'},
            {'0', '2', 'n'},
            {'4', '9', 'v'},
            {'9', '1', 'n'},
            {'9', '3', 'n'},
            {'0', '4', 'v'},
            {'4', '3', 'v'},
            {'5', '7', 'v'},
            {'0', '6', 'v'},
            {'9', '5', 'n'},
            {'7', '3', 'v'},
            {'7', '3', 'n'},
            {'3', '0', 'v'},
            {'8', '3', 'n'},
            {'4', '1', 'v'},
            {'6', '2', 'v'},
            {'9', '6', 'n'},
            {'7', '2', 'n'},
            {'1', '9', 'n'},
            {'9', '8', 'n'},
            {'3', '3', 'v'},
            {'8', '6', 'v'},
            {'1', '8', 'v'},
            {'7', '4', 'n'},
            {'1', '7', 'n'},
            {'8', '1', 'v'},
            {'8', '5', 'n'},
            {'3', '3', 'v'},
            {'1', '7', 'n'},
            {'2', '6', 'v'},
            {'0', '9', 'n'},
        };

        final char[][] B07 = {
            {'g', 'a', 't', 'x', 'r'},
            {'w', 'q', 'y', 'y', 'v', 't', 'f', 'k', 'k'},
            {'m', 'i', 'j', 'h', 'x'},
            {'s', 'p', 'o', 'c', 'z', 't'},
            {'n', 'v', 'r', 't', 'm'},
            {'z', 'w', 'e', 'y', 'v'},
            {'z', 'l', 'w', 'b', 'c', 'x'},
            {'x', 'b', 'i'},
            {'w', 'e', 'y', 'v', 'l'},
            {'x', 'h', 'w', 'b'},
            {'b', 'p', 'a', 'q', 'm', 'm', 'm', 'f'},
            {'x', 'i', 'p', 'l', 'u', 'q', 'y', 's'},
            {'s', 'l', 'y', 'x', 'o', 'g', 'o'},
            {'c', 'b', 'h', 'k', 'v', 'j', 'l', 'k', 'e'},
            {'h', 'p', 'd', 'v', 'g', 'm', 'r', 'i'},
            {'b', 'j', 'j', 'y', 'x', 't'},
            {'z', 'w', 'e', 'y', 'v', 'l'},
            {'g', 'w', 's', 'p', 'o', 'c', 'z', 't'},
            {'b', 'q'},
            {'p', 'o', 'c', 'z'},
            {'d', 'b', 'a', 'q', 'h', 'p'},
        };

        final char[][] P07 = {
            {'7', '9', 'n'},
            {'3', '6', 'v'},
            {'4', '5', 'n'},
            {'9', '4', 'v'},
            {'2', '7', 'v'},
            {'4', '8', 'v'},
            {'9', '8', 'n'},
            {'2', '4', 'v'},
            {'4', '9', 'v'},
            {'6', '0', 'n'},
            {'8', '7', 'v'},
            {'2', '4', 'n'},
            {'9', '4', 'n'},
            {'9', '7', 'n'},
            {'7', '5', 'v'},
            {'0', '2', 'n'},
            {'4', '8', 'v'},
            {'9', '2', 'v'},
            {'7', '2', 'n'},
            {'9', '5', 'v'},
            {'7', '1', 'v'},
        };

        final char[][] B08 = {
            {'t', 't', 'g'},
            {'f', 'k', 'w', 'a', 'm', 'y', 'm', 't', 'b'},
            {'g', 'r', 'u', 'd'},
            {'i', 'u', 'c', 'f', 'i'},
            {'n', 'e', 'q', 'l', 'k', 's', 'p'},
            {'h', 'g', 'y', 'i', 't', 'w', 'p', 'u', 'n'},
            {'s', 'p', 'y'},
            {'y', 'y', 'w', 'j'},
            {'k', 's', 'i', 'o', 'i', 'o', 'h', 'v'},
            {'y', 'm', 't'},
            {'u', 'd', 'x', 'e'},
            {'e', 'm', 'w', 'x', 'o', 'i', 'u', 'e', 'm'},
            {'t', 'u', 'a', 'q', 'h', 'x', 'y', 'm', 'e'},
            {'n', 'q', 'r', 'v', 'n', 'e', 'b'},
            {'q', 'd', 'r', 'g', 'y', 't', 'u', 'a'},
            {'h', 'j', 'h', 's', 'a'},
            {'z', 'f', 'j', 'k', 'd', 'y', 'c', 'j', 'z'},
            {'y', 'm', 's', 'e', 'u', 'o', 'h', 'h', 'b'},
            {'y', 't', 'u', 'a', 'q', 'h', 'x', 'y'},
            {'s', 'y', 'p'},
            {'q', 's'},
            {'z', 'q', 'q', 'f', 'm', 'a'},
            {'o', 'o'},
            {'y', 'p', 'o', 'o', 'p', 'z'},
            {'s', 'n', 'b'},
            {'y', 'y', 'q', 'n', 'e', 'g', 'z', 'u', 't'},
            {'k', 'w', 'a', 'm', 'y'},
            {'y', 'y', 'y'},
            {'e', 'g', 'z', 'u', 't', 'h', 'k', 'f', 'b'},
            {'a', 'h', 'g', 'y', 'i', 't', 'w'},
            {'g', 'u', 'e', 'v', 'y'},
            {'f', 'o', 'i', 'v'},
            {'e', 'v', 'y', 'i'},
            {'s', 'i', 'o', 'i', 'o', 'h', 'v'},
            {'d', 'r', 'g', 'y', 't', 'u'},
            {'t', 'g', 'u', 'e', 'v'},
            {'t', 'h', 'k', 'f', 'b', 'n'},
            {'q', 'r', 'p', 'j', 't', 'z', 'q', 'q'},
            {'n', 'q', 'n', 'g', 'k', 'w'},
            {'y', 'p', 'o'},
            {'a', 'u', 'n', 'v', 'y'},
            {'i', 'w', 'u', 'r', 'p'},
            {'f', 'o', 'i', 'v', 'u', 'm', 'q', 's'},
            {'n', 'k', 'q', 'r', 'p', 'j'},
        };

        final char[][] P08 = {
            {'3', '4', 'n'},
            {'2', '0', 'n'},
            {'4', '7', 'v'},
            {'2', '2', 'n'},
            {'0', '6', 'n'},
            {'9', '1', 'n'},
            {'5', '1', 'n'},
            {'0', '9', 'v'},
            {'2', '8', 'v'},
            {'7', '0', 'n'},
            {'4', '9', 'v'},
            {'3', '9', 'v'},
            {'9', '5', 'n'},
            {'8', '3', 'n'},
            {'4', '5', 'n'},
            {'6', '7', 'v'},
            {'7', '6', 'n'},
            {'0', '9', 'n'},
            {'8', '5', 'n'},
            {'5', '6', 'v'},
            {'2', '6', 'v'},
            {'8', '8', 'n'},
            {'5', '9', 'v'},
            {'5', '7', 'v'},
            {'9', '9', 'v'},
            {'7', '0', 'v'},
            {'3', '0', 'n'},
            {'0', '8', 'v'},
            {'7', '4', 'v'},
            {'8', '1', 'n'},
            {'5', '4', 'n'},
            {'2', '0', 'v'},
            {'7', '4', 'n'},
            {'2', '9', 'v'},
            {'5', '5', 'n'},
            {'4', '4', 'n'},
            {'7', '8', 'v'},
            {'3', '8', 'n'},
            {'1', '0', 'v'},
            {'5', '7', 'v'},
            {'8', '1', 'v'},
            {'6', '2', 'v'},
            {'2', '0', 'v'},
            {'1', '8', 'n'},
        };

        final char[][] B09 = {
            {'x', 'k', 'e', 'e', 'q', 'e', 't'},
            {'y', 'e', 'y', 'd'},
            {'v', 'q', 'n'},
            {'b', 'x', 'r'},
            {'c', 'o'},
            {'o', 'l'},
            {'y', 'o'},
            {'h', 'a', 's', 'q', 'w'},
            {'u', 'x', 'q', 'p'},
            {'a', 'f', 'w', 'm', 'b', 'f', 'h', 'e', 'i'},
            {'d', 'w', 'h', 'a', 's', 'q', 'w'},
            {'o', 'a', 'e'},
            {'b', 'y', 'o', 'g'},
            {'d', 'q', 'i'},
            {'s', 'c', 'd', 'q', 'i', 'f', 'k', 'm', 'm'},
        };

        final char[][] P09 = {
            {'3', '9', 'n'},
            {'2', '6', 'n'},
            {'2', '9', 'v'},
            {'3', '8', 'v'},
            {'1', '7', 'n'},
            {'8', '8', 'n'},
            {'2', '6', 'v'},
            {'6', '4', 'v'},
            {'7', '7', 'v'},
            {'4', '3', 'n'},
            {'6', '2', 'v'},
            {'5', '1', 'n'},
            {'2', '5', 'v'},
            {'6', '2', 'n'},
            {'4', '2', 'n'},
        };

        final char[][] B10 = {
            {'w', 'w', 'f', 'i', 'u', 'p'},
            {'g', 'g'},
            {'f', 'm', 'd', 'k', 's', 'u', 'b', 'a'},
            {'i', 'h', 'l', 'v', 'x', 'a', 'e'},
            {'a', 'q', 'p'},
            {'u', 'f', 'm'},
            {'d', 'h', 'c', 'q'},
            {'s', 'c', 'h', 'h', 'a', 'h', 'j', 'r', 'e'},
            {'c', 'j', 's', 'c', 'h', 'h', 'a', 'h'},
        };

        final char[][] P10 = {
            {'6', '2', 'v'},
            {'9', '6', 'n'},
            {'8', '5', 'v'},
            {'9', '0', 'n'},
            {'4', '3', 'v'},
            {'8', '4', 'v'},
            {'3', '6', 'n'},
            {'1', '3', 'v'},
            {'1', '1', 'v'},
        };

        System.out.println(Druga.krizankaOK(B01, P01));
        System.out.println(Druga.krizankaOK(B02, P02));
        System.out.println(Druga.krizankaOK(B03, P03));
        System.out.println(Druga.krizankaOK(B04, P04));
        System.out.println(Druga.krizankaOK(B05, P05));
        System.out.println(Druga.krizankaOK(B06, P06));
        System.out.println(Druga.krizankaOK(B07, P07));
        System.out.println(Druga.krizankaOK(B08, P08));
        System.out.println(Druga.krizankaOK(B09, P09));
        System.out.println(Druga.krizankaOK(B10, P10));
    }
}
