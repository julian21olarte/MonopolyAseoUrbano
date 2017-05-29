/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MUNDO;

import GUI.Final;
import GUI.InfoJugador;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author JulianOlarte
 */
public class Monopoly {
    
    private Jugador[] jugadores;
    private JButton botones[];
    private Pregunta[] preguntas,sorpresas;
    private JFrame prin,tablero;
    private JButton eliminado;
    
    public Monopoly(int n,JFrame prin)
    {
        
        this.prin=prin;
        //config. jugadores
        Jugador[] jugaux=new Jugador[4];
        jugaux[0]=new Jugador("jugador 1",Color.red,new Point(55,12));
        jugaux[1]=new Jugador("jugador 2",Color.blue,new Point(12,12));
        jugaux[2]=new Jugador("jugador 3",Color.green,new Point(55,50));
        jugaux[3]=new Jugador("jugador 4",Color.pink,new Point(12,50));
        this.eliminado=null;
        jugadores=new Jugador[n]; 
        botones=new JButton[n];
        int i=0;
        while(i<n)
        { 
            jugadores[i]=jugaux[i];
            botones[i]=new JButton();
            botones[i].setBounds(jugaux[i].inicio.x, jugaux[i].inicio.y, 38, 38);
            botones[i].setBackground(jugaux[i].color);
            botones[i].setText(""+(i+1));
            botones[i].setFont(new Font("Verdana",1,11));
            botones[i].setBorder(BorderFactory.createLineBorder(Color.black, 2));
            final Monopoly m=this;
            botones[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton evento = (JButton)e.getSource();
                    if(!m.getEliminado().equals(evento))
                    {
                        InfoJugador info=new InfoJugador(m,evento);
                        info.setVisible(true);
                    }
                    
                }
            });
            i++;
        }
        
        //config. preguntas
        this.preguntas=new Pregunta[49];
        this.sorpresas=new Pregunta[21];
        preguntas[0]=new Pregunta("Pregunta","EL SISTEMA DE GESTION DOCUMENTAL  PERMITE LA CONTABILIZACION DIARIA DE FACTURAS?","FALSO",null);
        preguntas[1]=new Pregunta("Pregunta","EL SISTEMA AX12 GENERA EL RADICADO DE UNA COMUNICACIÓN EXTERNA?","FALSO",null);
        preguntas[2]=new Pregunta("Pregunta","EL AREA DE COMPRAS ESTA ENCARGADO DE ENVIAR LAS ORDENES DE COMPRA A PROVEEDORES?","VERDADERO",null);
        preguntas[3]=new Pregunta("Pregunta","EL DEPARTAMENTO CONTABLE REGISTRA LEGALIZACIONES DE ANTICIPOS?","VERDADERO",null);
        preguntas[4]=new Pregunta("Pregunta","LOS VALES DE CAJA MENOR SON UTILIZADOS PARA SOPORTAR LA COMPRA DE UN ARTICULO?","FALSO",null);
        preguntas[5]=new Pregunta("Pregunta","EN UNA LEGALIZACION EL UNICO DOCUMENTO VALIDO PARA SOPORTE DE LA COMPRA DE UN ELEMENTO ES LA FACTURA?","FALSO",null);
        
        preguntas[6]=new Pregunta("Pregunta","EN CASO DE OLVIDAR MI CLAVE DE ACCESO ME DEBO COMUNICAR CON EL AREA TI?","VERDADERO",null);
        preguntas[7]=new Pregunta("Pregunta","SI NECESITO UN PRESTAMO DE DINERO EN LA EMPRESA ME COMUNICO CON EL AREA FINANCIERA?","FALSO",null);
        preguntas[8]=new Pregunta("Pregunta","CUANDO SOLICITO VIATICOS ESTOS DEBEN SER LEGALIZADOS EN 5 DIAS POSTERIOR AL VIAJE?","FALSO",null);
        preguntas[9]=new Pregunta("Pregunta","EL AREA DE TI RESUELVE LAS INQUIETUDES GENERADAS RESPECTO A LAS SOLICITUDES REALIZADAS POR EL SOFTWARE GLPI?","VERDADERO",null);
        preguntas[10]=new Pregunta("Pregunta","EL AREA DE TI ESTA ENCARGADA DE ENTREGAR CERTIFICADOS DE RETENCION?","FALSO",null);
        
        preguntas[11]=new Pregunta("Pregunta","SI PRESENTA DAÑOS MI COMPUTADOR ASIGNADO LO DEBO REPORTAR AL AREA TI MEDIANTE EL SOFTWARE GLPI?","VERDADERO",null);
        
        preguntas[12]=new Pregunta("Pregunta","SI NECESITO COMPRAR  UNA SILLA GIRATORIA, DEBO PEDIRLA AL PROVEEDOR Y LUEGO LA LEGALIZO EN CONTABILIDAD?","FALSO",null);
        preguntas[13]=new Pregunta("Pregunta","EL UNICO PUNTO AUTORIZADO PARA RECIBIR FACTURAS DE TERCEROS ES RECEPCION?","VERDADERO",null);
        preguntas[14]=new Pregunta("Pregunta","CADA FACTURA QUE LLEGA A CONTABILIDAD DEBE TENER EL STIKER RADICADO DEL SISTEMA ORFEO?","VERDADERO",null);
        preguntas[15]=new Pregunta("Pregunta","PARA CREAR UN PROVEEDOR DEBO PEDIRLE RUT,CAMARA COMERCIO Y CERTIFICACION BANCARIA?","VERDADERO",null);
        preguntas[16]=new Pregunta("Pregunta","EN EL SISTEMA GLPI SE REGISTRAN TODOS LOS ACTIVOS FIJOS QUE SE COMPRAN EN ASEO URBANO?","FALSO",null);
        preguntas[17]=new Pregunta("Pregunta","EL AREA FINANCIERA DETERMINA LA TASA DE INTERES Y APRUEBA PRESTAMOS PARA LIBRE INVERSION A EMPLEADOS?","FALSO",null);
        preguntas[18]=new Pregunta("Pregunta","PARA RETIRAR UN ARTICULO INVENTARIABLE DEBO DILIGENCIAR EL FORMATO DE SALIDAS DE ALMACEN?","VERDADERO",null);
        preguntas[19]=new Pregunta("Pregunta","ES POLITICA DEL AREA FINANCIERA PAGAR A LOS PROVEEDORES EN CHEQUE?","FALSO",null);
        preguntas[20]=new Pregunta("Pregunta","EL AREA TI REALIZA ACTUALIZACION Y MANTENIMIENTO DE LOS SISTEMAS DE INFORMACION?","VERDADERO",null);
        preguntas[21]=new Pregunta("Pregunta","EL DIA DE CORTE CONTABLE PARA RECEPCION DE FACTURAS ES EL DIA 26 DE CADA MES?","VERDADERO",null);
        preguntas[22]=new Pregunta("Pregunta","LA EVALUACION DE PROVEEDORES Y CONTRATISTAS LA REALIZA CADA MES EL AREA TI?","FALSO",null);
        preguntas[23]=new Pregunta("Pregunta","EL AREA TI ESTA ENCARGADA DE CONTROLAR EL CONSUMO DE ENERGIA EN LAS SEDES?","FALSO",null);
        preguntas[24]=new Pregunta("Pregunta","CALIDAD, PRECIO Y GARANTIA SON FUNDAMENTALES PARA REALIZAR UNA COMPRA EFCICIENTE?","VERDADERO",null);
        preguntas[25]=new Pregunta("Pregunta","EL SISTEMA AX12 CONTIENE INFORMACION ACTUALIZADA DE ARTICULOS INVENTARIABLES Y ACTIVOS FIJOS?","VERDADERO",null);
        preguntas[26]=new Pregunta("Pregunta","EL AREA ADMINISTRATIVA Y FINANCIERA LIDERA ACTUALMENTE LOS INDICADORES DE AHORRO DE PAPEL E IMPRESIONES?","VERDADERO",null);
        preguntas[27]=new Pregunta("Pregunta","CIUDAD MEJOR ES UN CONTRATISTA ESTRATEGICO QUE NOS APOYA EN AUDITORIAS INTERNAS?","VERDADERO",null);
        preguntas[28]=new Pregunta("Pregunta","EL INDICADOR EBITDA PERMITE VISUALIZAR LA CANTIDAD DE PORTATILES QUE SE COMPRAN EN LA EMPRESA?","FALSO",null);
        preguntas[29]=new Pregunta("Pregunta","EL AREA TI ESTA ENCARGADA DE ASIGNAR LA DISPONIBILIDAD DE ELEMENTOS INVENTARIABLES?","FALSO",null);
        preguntas[30]=new Pregunta("Pregunta","EL AREA DE TI CONTROLA LOS CONTRATOS DE ARRENDAMIENTO DE IMPRESORAS EN LA EMPRESA?","VERDADERO",null);
        preguntas[31]=new Pregunta("Pregunta","EL SISTEMA INFORMATICO PRICEWATERHOUSECOOPERS NOS ENTREGA LOS ESTADOS FINANCIEROS?","FALSO",null);
        preguntas[32]=new Pregunta("Pregunta","MACRO INSUMOS ES UN PROVEEDOR ESTRATEGICO QUE NOS PROVEE LUBRICANTES Y COMBUSTIBLES?","FALSO",null);
        preguntas[33]=new Pregunta("Pregunta","EL PRINCIPAL ELEMENTO COMPRADO POR FINANCIERA PARA APOYAR LA OPERACIÓN DE BARRIDO SON LAS ESCOBAS DOMESTICAS?","FALSO",null);
        preguntas[34]=new Pregunta("Pregunta","EL SISTEMA ORFEO PERMITE DIRECCIONAR LA DOCUMENTACION QUE LLEGA DE NUESTROS USUARIOS Y/O PROVEEDORES?","VERDADERO",null);
        preguntas[35]=new Pregunta("Pregunta","EL SISTEMA GEOASEO ES EL ENCARGADO DE CONTROLAR Y DAR SEGUIMIENTO EN TIEMPO REAL A LA EJECUCION DE LAS RUTAS DE RECOLECCION?","VERDADERO",null);
        preguntas[36]=new Pregunta("Pregunta","EL AREA DE TI ES LA ENCARGADA DE REALIZAR O GESTIONAR SISTEMAS DE INFORMACION AMIGABLES AL USUARIO?","VERDADERO",null);
        preguntas[37]=new Pregunta("Pregunta","LOS TICKETS GENERADOS EN EL SOFTWARE GLPI SON ATENDIDOS POR EL AREA DE OPERACIONES?","FALSO",null);
        preguntas[38]=new Pregunta("Pregunta","LOS MANTENIMIENTOS PREVENTIVOS DE LOS EQUIPOS DE COMPUTO SON REALIZADOS POR EL AREA DE COMPRAS?","FALSO",null);
        
        preguntas[39]=new Pregunta("Pregunta","El area de compras, gestiona el proceso para la adquision de los bienes y servicios para las diferente areas y los insumos para la operación?".toUpperCase(),"VERDADERO",null);
        preguntas[40]=new Pregunta("Pregunta","El pago de proveedores se realiza  de acuerdo a las Políticas de Tesorería establecida por el GrupoSala, el Coordinador Corporativo Administrativo y Financiero revisan el vencimiento de los proveedores y de acuerdo al flujo disponible se programa el pago de las facturas vencidas?".toUpperCase(),"VERDADERO",null);
        preguntas[41]=new Pregunta("Pregunta","Es el Auxiliar Contable el que realiza el registro de las facturas que le sean asignadas con los correspondientes vistos buenos de los Jefes de área?".toUpperCase(),"VERDADERO",null);
        preguntas[42]=new Pregunta("Pregunta","El area contable es el encargado de realizar los pagos a proveedores y terceros?".toUpperCase(),"FALSO",null);
        preguntas[43]=new Pregunta("Pregunta","La compañía debe suministrar los viaticos necesarios para el desplazamiento de una ciudad a otra?".toUpperCase(),"VERDADERO",null);
        preguntas[44]=new Pregunta("Pregunta","la responsabilidad de los gastos de viaje de personal es del area de compras?".toUpperCase(),"FALSO",null);
        preguntas[45]=new Pregunta("Pregunta","Una de las Funciones del equipo de contabilidad es revisar  y registrar la información contable para lograr generar información confiable y oportuna?".toUpperCase(),"VERDADERO",null);
        preguntas[46]=new Pregunta("Pregunta","El area de TI - SISTEMA, es el encargado de Gestionar el desarrollo, actualización y/o adecuación de Sistemas de Información a cualquier proceso dentro de la empresa que lo requiera?".toUpperCase(),"VERDADERO",null);
        preguntas[47]=new Pregunta("Pregunta","El departamenteo de Financiera Planifica el desarrollo de los proyectos informáticos requeridos y la implementación de nuevas tecnologías?".toUpperCase(),"FALSO",null);
        preguntas[48]=new Pregunta("Pregunta","el area de  contabilidad es el encargado de liquidar las cesantias?".toUpperCase(),"FALSO",null);

        
        
        
        
        sorpresas[0]=new Pregunta("Sorpresa","POR $5.000, CONTESTE: \n¿EL NIT DE ASEO URBANO ES 807050020-8?","FALSO",null);
        sorpresas[1]=new Pregunta("Sorpresa","POR $10.000, CONTESTE: \n¿LA FECHA FUNDACION DE ASEO URBANO ES EL 10 DE NOV DEL 2000?","FALSO",null);
        sorpresas[2]=new Pregunta("Sorpresa","POR $15.000, CONTESTE: \n¿URBANITO ES EL LOGO OFICIAL DE LA EMPRESA","FALSO",null);
        sorpresas[3]=new Pregunta("Sorpresa","POR $5.000, CONTESTE: \n¿ASEO URBANO EN LA ACTUALIDAD CUENTA CON MAS DE 500 TRABAJADORES  DIRECTOS?","VERDADERO",null);
        sorpresas[4]=new Pregunta("Sorpresa","POR $20.000, CONTESTE: \nACTUALMENTE ASEO URBANO SAS OPERA RECOLECCION DE RESIDUOS DOMICILIARIOS EN 6 MUNICIPIOS, MENCIONELOS:","CUCUTA\nPATIOS\nVILLA DEL ROSARIO\nAGUACHICA\nPELAYA\nYOPAL",null);
        sorpresas[5]=new Pregunta("Sorpresa","POR $5.000, CONTESTE: \nCONSIDERADO COMO UNO DE LOS MEJORES SITIOS DE DISPOSICION FINAL DE RESIDUOS EN SURAMERICA POR EL BANCO MUNDIAL","PARQUE AMBIENTAL GUAYABAL",null);
        sorpresas[6]=new Pregunta("Sorpresa","POR $5.000, CONTESTE: \n¿ACTUALMENTE ASEO URBANO SAS CUENTA CON LAS CERTIFICACIONES ISO9001-14001-18001 ICONTEC?","VERDADERO",null);
        sorpresas[7]=new Pregunta("Sorpresa","POR $10.000 CONTESTE: \n¿CONTAMOS CON BARRIDO MECANIZADO INCORPORADO EN NUESTROS SERVICIOS DESDE EL AÑO 2013?","VERDADERO",null);
        sorpresas[8]=new Pregunta("Sorpresa","POR $5.000 CONTESTE: \n¿PRESTAMOS SERVICIOS DE RESIDUOS ESPECIALES CON ECOPETROL EN NORTE DE SANTANDER?","VERDADERO",null);
        sorpresas[9]=new Pregunta("Sorpresa","POR $5.000, CONTESTE: \n¿ES EL GERENTE REGIONAL DE ASEO URBANO EL ING. ANGEL URIEL GARCIA TORRES?","VERDADERO",null);
        sorpresas[10]=new Pregunta("Sorpresa","POR $5.000, CONTESTA: \n¿ASEO URBANO ENTREGA EL SERVICIO DE CONTENERIZACION DE LOS RESIDUOS EN CUCUTA?","VERDADERO",null);
        sorpresas[11]=new Pregunta("Sorpresa","POR $3.000, CONTESTA: \n¿ASEO URBANO ENTREGA EL SERVICIO DE ALQUILER DE BAÑOS PORTATILES EN EL NORTE DE SANTANDER?","VERDADERO",null);
        sorpresas[12]=new Pregunta("Sorpresa","POR $8.000, CONTESTE: \n¿ASEO URBANO CUENTA CON LA TECNOLOGIA ADECUADA PARA ENTREGAR UN SERVICIO OPORTUNO Y DE CALIDAD?","VERDADERO",null);
        sorpresas[13]=new Pregunta("Sorpresa","POR $5.000, CONTESTE: \n¿ASEO URBANO APOYA EL DEPORTE Y EL BIENESTAR SOCIAL A SUS EMPLEADOS?","VERDADERO",null);
        sorpresas[14]=new Pregunta("Sorpresa","SI POR EL PARQUE SANTANDER PASASTE DEBES DEJAR TU DONACION DE $5.000 PARA EMBELLECER",null,null);
        sorpresas[15]=new Pregunta("Sorpresa","POR UTILIZAR PUENTE EMBLEMATICO DE CUCUTA UBICADO SOBRE LA AVENIDA LIBERTADORES DEBES PAGAR $15.000 AL BANCO",null,null);
        
        sorpresas[16]=new Pregunta("Sorpresa","VAYA AL GENERAL SANTANDER Y DISFRUTE DE UN BONO DE $10.000",null,16);//parque o estadio?????
        sorpresas[17]=new Pregunta("Sorpresa","VAYA A LA ALCALDIA Y PAGUE IMPUESTO DE RODAMIENTO DE $5.000",null,19);
        sorpresas[18]=new Pregunta("Sorpresa","VAYA AL VENTURA DE COMPRAS EL BANCO LE OBSEQUIA $30.000",null,23);
        sorpresas[19]=new Pregunta("Sorpresa","VAYA AL PARQUE SIMON BOLIVAR  Y HAGA UN APORTE AL BANCO DE $5.000 PARA EMBELLECER",null,11);
        sorpresas[20]=new Pregunta("Sorpresa","VAYA A LA CARCEL Y PAGUE EL VALOR CORRESPONDIENTE.",null,6);
        
        
        
        
    }
    
    public void setTablero(JFrame tablero)
    {
        this.tablero=tablero;
    }
    
    public Jugador[] getJugadores()
    {
        return this.jugadores;
    }
    
    public JButton[] getBotones()
    {
        return this.botones;
    }
    
    public int getNum()
    {
        return this.botones.length;
    }
    
    public Pregunta[] getPreguntas()
    {
        return this.preguntas;
    }
    
    public Pregunta[] getSorpresas()
    {
        return this.sorpresas;
    }
    
    public JButton eliminarJugador(int jug)
    {
        String nombre="jugador "+jug;
        int tam=this.jugadores.length-1;
        JButton elim=null;
        int i=0,k=0;
        Jugador[] j=new Jugador[tam];
        JButton[] b=new JButton[tam];
        
        while(k<tam)
        {
            if(!this.jugadores[i].getNombre().equals(nombre))
            {
                j[k]=this.jugadores[i];
                b[k]=this.botones[i];   
                k++;
            }
            else
            {
                elim=this.botones[i];
            }
            i++;
        }
        this.jugadores=j;
        this.botones=b;
        
        if(this.jugadores.length==0)
        {
            Final f=new Final(tablero,prin);
            f.setVisible(true);
        }
        return this.eliminado=elim;
    }
    
    public JButton getEliminado()
    {
        return this.eliminado;
    }
    
    public void setEliminado(JButton eli)
    {
        this.eliminado=eli;
    }
    
    
}

