import 'package:flutter/material.dart';
import 'screens/hoofd_koelkast.dart';
import 'screens/recepten.dart';
import 'screens/boodschappen_lijst.dart';

void main() {
  runApp(const KoelkastApp());
}

class KoelkastApp extends StatelessWidget {
  const KoelkastApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Koelkast App',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        useMaterial3: true,
      ),
      home: const MainScreen(),
    );
  }
}

class MainScreen extends StatefulWidget {
  const MainScreen({super.key});

  @override
  State<MainScreen> createState() => _MainScreenState();
}

class _MainScreenState extends State<MainScreen> {
  int _selectedIndex = 0;
  
  final List<Widget> _screens = [
    const HoofdKoelkastScreen(),
    const ReceptenScreen(),
    const BoodschappenLijstScreen(),
  ];

  void _onItemTapped(int index) {
    setState(() {
      _selectedIndex = index;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      body: _screens[_selectedIndex],
      bottomNavigationBar: BottomNavigationBar(
        items: const <BottomNavigationBarItem>[
          BottomNavigationBarItem(
            icon: Icon(Icons.kitchen),
            label: 'Koelkast',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.restaurant_menu),
            label: 'Recepten',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.shopping_cart),
            label: 'Boodschappen',
          ),
        ],
        currentIndex: _selectedIndex,
        onTap: _onItemTapped,
      ),
    );
  }
} 