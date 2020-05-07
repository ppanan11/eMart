import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserBuyTrasactionsComponent } from './user-buy-trasactions.component';

describe('UserBuyTrasactionsComponent', () => {
  let component: UserBuyTrasactionsComponent;
  let fixture: ComponentFixture<UserBuyTrasactionsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserBuyTrasactionsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserBuyTrasactionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
