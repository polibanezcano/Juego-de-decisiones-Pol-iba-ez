import java.util.Scanner;

public class P02HistoriaPIC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Resumen de decisiones
        String mapa = "";
        String entroruina = "";
        String pedestal = "";
        String anillo = "";
        String finalHistoria = "";

        // Estado
        boolean tienesMapa = false; // objeto de la Decisión 0
        boolean entroRuinas = false; // rama A/B de la Decisión 1

        System.out.println("La Isla del Faro — Aventura con múltiples finales");
        System.out.println("Estás en una cala de una isla desconocida. Entre algas y cuerdas,");
        System.out.println("encuentras un MAPA arrugado que señala un faro en lo alto de un acantilado.");
        System.out.println();

        // DECISIÓN 0: Tomar o no el objeto (MAPA)
        System.out.println("Decisión 0: ¿Qué haces con el MAPA?");
        System.out.println("1) Guardarlo.");
        System.out.println("2) Dejarlo y seguir sin él.");
        System.out.print("Elige (1-2): ");
        int op0 = sc.nextInt();
        if (op0 == 1) {
            tienesMapa = true;
            mapa = "Has guardado el mapa.";
        } else {
            tienesMapa = false;
            mapa = "Has dejado el mapa.";
        }
        System.out.println();

        // Presentación rama principal
        System.out.println("Caminas por la costa y llegas a una bifurcación: ruinas antiguas a la izquierda");
        System.out.println("y un sendero que sube al faro por la derecha.");
        System.out.println();

        // DECISIÓN 1: ¿Ruinas o Faro?
        System.out.println("Decisión 1:");
        System.out.println("1) Entrar en las ruinas.");
        System.out.println("2) Subir por el sendero hacia el faro.");
        System.out.print("Elige (1-2): ");
        int op1 = sc.nextInt();
        if (op1 == 1) {
            entroRuinas = true;
            entroruina = "Has entrado en las ruinas.";
        } else {
            entroRuinas = false;
            entroruina = "Has subido hacia el faro.";
        }
        System.out.println();

        if (entroRuinas) {
            // === RAMA RUINAS ===
            System.out.println("Entre columnas caídas y murales borrosos encuentras una cámara con dos elementos:");
            System.out.println("un PEDESTAL con inscripciones y una PASARELA que conduce a una sala oscura.");
            System.out.println();

            // DECISIÓN 2 en RUINAS: Pedestal o Pasarela
            System.out.println("Decisión 2 (Ruinas):");
            System.out.println("1) Examinar el pedestal.");
            System.out.println("2) Cruzar por la pasarela a la sala oscura.");
            System.out.print("Elige (1-2): ");
            int op2 = sc.nextInt();
            if (op2 == 1) {
                pedestal = "Has examinado el pedestal.";
                System.out.println();
                System.out.println("El pedestal tiene un relieve que coincide con el mapa del faro.");
                System.out.println("Una compuerta se entreabre mostrando un mecanismo con dos opciones.");
                System.out.println();

                // DECISIÓN 3 en RUINAS-PEDESTAL: Girar anillo o presionar símbolo
                System.out.println("Decisión 3 (Ruinas-Pedestal):");
                System.out.println("1) Girar el anillo exterior.");
                System.out.println("2) Presionar el símbolo central.");
                System.out.print("Elige (1-2): ");
                int op3 = sc.nextInt();
                if (op3 == 1) {
                    anillo = "Has girado el anillo exterior.";
                    // Final depende de tener mapa (condición compuesta ejemplo con &&)
                    if (tienesMapa && entroRuinas) {
                        finalHistoria = "FINAL ARQUEÓLOGO: Alineas el anillo según el mapa y revelas una cripta con reliquias.";
                    } else {
                        finalHistoria = "FINAL TRAMPA: Sin las marcas del mapa, activas un gas soporífero y despiertas fuera de las ruinas.";
                    }
                } else {
                    anillo = "Has presionado el símbolo central.";
                    if (tienesMapa && entroRuinas) {
                        finalHistoria = "FINAL PASAJE SECRETO: El símbolo abre un corredor a un mirador seguro hacia el faro.";
                    } else {
                        finalHistoria = "FINAL COLAPSO: Un temblor derrumba parte de la sala y te ves obligado a salir con lo puesto.";
                    }
                }
            } else {
                pedestal = "Has cruzado por la pasarela a la sala oscura.";
                System.out.println();
                System.out.println("La sala oscura resuena con viento. Notas corrientes de aire detrás de una pared.");
                System.out.println("Hay una PALANCA y un HUECO estrecho por el que podrías reptar.");
                System.out.println();

                // DECISIÓN 3 en RUINAS-PASARELA: Palanca o Reptar
                System.out.println("Decisión 3 (Ruinas-Pasarela):");
                System.out.println("1) Accionar la palanca.");
                System.out.println("2) Reptar por el hueco.");
                System.out.print("Elige (1-2): ");
                int op3 = sc.nextInt();
                if (op3 == 1) {
                    pedestal = "Has accionado la palanca.";
                    if (tienesMapa && entroRuinas) {
                        finalHistoria = "FINAL MECANISMO ANTIGUO: Abres una puerta lateral que conecta con un embarcadero seguro.";
                    } else {
                        finalHistoria = "FINAL ATRAPADO: La sala se sella y solo consigues salir horas después, exhausto.";
                    }
                } else {
                    anillo = "Has reptado por el hueco.";
                    if (tienesMapa && entroRuinas) {
                        finalHistoria = "FINAL ESCAPE SUTIL: El hueco da a un túnel de servicio marcado también en el mapa.";
                    } else {
                        finalHistoria = "FINAL CAÍDA: El hueco desemboca en una sima; caes a una cornisa y debes pedir ayuda.";
                    }
                }
            }
        } else {
            // === RAMA FARO ===
            System.out.println("El sendero sube en zigzag. Llegas a un claro con vistas al mar y el faro al fondo.");
            System.out.println("Ves una CABAÑA guardacostas y un ATALLO por la ladera.");
            System.out.println();

            // DECISIÓN 2 en FARO: Cabaña o Atajo
            System.out.println("Decisión 2 (Faro):");
            System.out.println("1) Investigar la cabaña.");
            System.out.println("2) Tomar el atajo por la ladera.");
            System.out.print("Elige (1-2): ");
            int op2 = sc.nextInt();
            if (op2 == 1) {
                entroruina = "Has investigado la cabaña.";
                System.out.println();
                System.out.println("Dentro hay herramientas, una linterna y un cuaderno con anotaciones del faro.");
                System.out.println("El cuaderno menciona una 'señal' que solo se interpreta con un buen mapa.");
                System.out.println();

                System.out.println("Decision 4 (Linterna).");
                System.out.println("1 coges lintena");
                String linterna = sc.next();
                if (linterna.equals("Si")){

                }
                else
                {

                }
           

                // DECISIÓN 3 en FARO-CABAÑA: Linterna o Cuaderno
                System.out.println("Decisión 3 (Faro-Cabaña):");
                System.out.println("1) Llevar la linterna y subir.");
                System.out.println("2) Quedarte revisando el cuaderno antes de subir.");
                System.out.print("Elige (1-2): ");
                int op3 = sc.nextInt();
                if (op3 == 1) {
                    anillo = "Has llevado la linterna y has subido.";
                    if (tienesMapa && !entroRuinas) {
                        finalHistoria = "FINAL GUARDIÁN DEL FARO: Con mapa y luz descifras la señal y reactivas el faro.";
                    } else {
                        finalHistoria = "FINAL FARO A MEDIAS: Logras encenderlo, pero sin mapa la señal queda desfasada.";
                    }
                } else {
                    anillo = "Te has quedado revisando el cuaderno.";
                    if (tienesMapa && !entroRuinas) {
                        finalHistoria = "FINAL MENSAJE COMPLETO: Mapa y notas te permiten emitir una llamada de auxilio perfecta.";
                    } else {
                        finalHistoria = "FINAL DEMORA: Pierdes la marea de rescate; tendrás que pasar la noche en el faro.";
                    }
                }
            } else {
                pedestal = "Has tomado el atajo por la ladera.";
                System.out.println();
                System.out.println("El atajo es empinado y resbaladizo. Oyes bocinas a lo lejos: se acerca una tormenta.");
                System.out.println("Puedes ESCALAR con cuidado o rodear por una CORNISA estrecha.");
                System.out.println();

                // DECISIÓN 3 en FARO-ATAJO: Escalar o Cornisa
                System.out.println("Decisión 3 (Faro-Atajo):");
                System.out.println("1) Escalar con cuidado.");
                System.out.println("2) Rodear por la cornisa.");
                System.out.print("Elige (1-2): ");
                int op3 = sc.nextInt();
                if (op3 == 1) {
                    anillo = "Has escalado con cuidado.";
                    if (tienesMapa && !entroRuinas) {
                        finalHistoria = "FINAL CIMA CARTOGRAFÍADA: Sigues marcas del mapa y alcanzas una entrada segura al faro.";
                    } else {
                        finalHistoria = "FINAL RESBALÓN: Una piedra cede; consigues salvarte, pero abandonas la subida.";
                    }
                } else {
                    anillo = "Has rodeado por la cornisa.";
                    if (tienesMapa && !entroRuinas) {
                        finalHistoria = "FINAL RUTA OCULTA: El mapa te guía por marcas antiguas hasta una puerta lateral del faro.";
                    } else {
                        finalHistoria = "FINAL RIESGO CONTROLADO: Llegas tarde al faro; la tormenta obliga a refugiarte sin encenderlo.";
                    }
                }
            }
        }

        // Resumen final
        System.out.println();
        System.out.println("=== RESUMEN DE TUS DECISIONES ===");
        System.out.println("Decisión 0: " + mapa);
        System.out.println("Decisión 1: " + entroruina);
        System.out.println("Decisión 2: " + pedestal);
        System.out.println("Decisión 3: " + anillo);
        System.out.println("---------------------------------");
        System.out.println(finalHistoria);
        System.out.println("Gracias por jugar.");
        sc.close();
    }
}
